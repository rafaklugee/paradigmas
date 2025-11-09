base :: Int -> (String, String, Char)
base x
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", "nada", 'x')

contMestre :: [(String, String, Char)] -> Int
contMestre [] = 0
contMestre ((nome, tipo, genero):t)
    | tipo == "mestre" = 1 + contMestre t
    | otherwise = contMestre t

contDoc :: [(String, String, Char)] -> Int
contDoc [] = 0
contDoc ((nome, tipo, genero):t)
    | tipo == "doutor" = 1 + contDoc t
    | otherwise = contDoc t

contMD :: String -> [(String, String, Char)] -> Int
contMD titulo [] = 0
contMD titulo ((nome, tipo, genero):t)
    | tipo == titulo = 1 + contMD titulo t
    | otherwise = contMD titulo t

cont :: String -> Char -> [(String, String, Char)] -> Int
cont tip gen [] = 0
cont tip gen ((nome, tipo, genero):t)
    | tipo == tip && genero == gen = 1 + cont tip gen t
    | otherwise = cont tip gen t