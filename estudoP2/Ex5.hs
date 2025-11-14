categoriaIdade :: Int -> String
categoriaIdade x
    | x < 12 = "Criança"
    | x >= 12 && x <= 17 = "Adolescente"
    | x >= 18 && x <= 59 = "Adulto"
    | otherwise = "Idoso"