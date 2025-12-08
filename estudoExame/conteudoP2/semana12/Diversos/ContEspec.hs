base :: Int -> (String, String, Char)
base x
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", "x", 'x')

contMestre :: Int -> Int
contMestre 0 = 0
contMestre n
    | titulo == "mestre" = 1 + contMestre (n-1)
    | otherwise = contMestre (n-1)
    where
        (_, titulo, _) = base n

contDoc :: Int -> Int
contDoc 0 = 0
contDoc n
    | titulo == "doutor" = 1 + contDoc (n-1)
    | otherwise = contDoc (n-1)
    where
        (_, titulo, _) = base n

contMd :: Int -> String -> Int
contMd 0 _ = 0
contMd n titulo
    | titulo == titulacao = 1 + contMd (n-1) titulo
    | otherwise = contMd (n-1) titulo
    where
        (_, titulacao, _) = base n

cont :: Int -> String -> Char -> Int
cont 0 _ _ = 0
cont n titulo genero
    | titulo == titulacao && genero == gen = 1 + cont (n-1) titulo genero
    | otherwise = cont (n-1) titulo genero
    where
        (_, titulacao, gen) = base n
