module TestandoCond where

idadeMin1 :: Int -> String
idadeMin1 x 
    | x >= 18 = "Pode beber"
    | otherwise = "Nao pode beber"

idadeMin2 :: Int -> String
idadeMin2 x = if x >= 18
    then "Pode beber"
    else "Nao pode beber"

defNum1 :: Int -> String
defNum1 x
    | x > 0 = "Positivo"
    | x < 0 = "Negativo"
    | otherwise = "Igual a zero"

defNum2 :: Int -> String
defNum2 x = if x > 0 
    then "Positivo"
    else if x < 0
        then "Negativo"
    else "Igual a zero"

anoBis1 :: Int -> Bool
anoBis1 ano = if (ano `mod` 400 == 0)
    then True
    else if (ano `mod` 100 == 0)
        then False
        else if (ano `mod` 4 == 0)
            then True
            else False

anoBis2 :: Int -> Bool
anoBis2 ano = if div400
    then True
    else if div100
        then False
        else if div4
            then True
            else False
    where
        div400 = ano `mod` 400 == 0
        div100 = ano `mod` 100 == 0
        div4   = ano `mod` 4 == 0

anoBis3 :: Int -> Bool
anoBis3 ano
    | div400    = True
    | div100    = False 
    | div4      = True
    | otherwise = False
    where
        div400 = ano `mod` 400 == 0
        div100 = ano `mod` 100 == 0
        div4   = ano `mod` 4 == 0
