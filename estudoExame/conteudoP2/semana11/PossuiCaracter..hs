possuiCaracter :: [Char] -> Char -> Bool
possuiCaracter [] _ = False
possuiCaracter (h:t) caracter
    | h == caracter = True
    | otherwise = possuiCaracter t caracter