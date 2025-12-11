primeiro :: (String, Float, Char) -> String
primeiro (nome, _, _) = nome

segundo :: (String, Float, Char) -> Float
segundo (_, altura, _) = altura

terceiro :: (String, Float, Char) -> Char
terceiro (_, _, genero) = genero

base :: Int -> (String, Float, Char)
base x
    |x == 1 = ("joao", 1.50, 'm')
    |x == 2 = ("jonas", 1.55, 'm')
    |x == 3 = ("joice", 1.60, 'f')
    |x == 4 = ("janete", 1.65, 'f')
    |x == 5 = ("jocileide", 1.70, 'f')
    |otherwise = ("ninguem", 0, 'x')

maiorAltura :: Int -> Float
maiorAltura 0 = 0
maiorAltura n
    | alturaAtual > alturaMaior = alturaAtual 
    | otherwise = alturaMaior
    where
        alturaAtual = segundo(base n)
        alturaMaior = maiorAltura(n-1)

maiorAlturaAle :: Int -> Float
maiorAlturaAle 0 = 0
maiorAlturaAle n
    | segundo(base n) > maiorAlturaAle(n-1) = segundo(base n)
    | otherwise = maiorAlturaAle(n-1)