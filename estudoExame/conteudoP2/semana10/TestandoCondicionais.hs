module TestandoCondicionais where

ehMaior1 :: Int -> String
ehMaior1 x
    | x >= 18 = "Pode beber"
    | otherwise = "Nao pode beber"

ehMaior2 :: Int -> String
ehMaior2 x = if x >= 18
    then "Pode beber"
    else "Nao pode beber"

posNeg1 :: Int -> String
posNeg1 x
    | x > 0 = "Positivo"
    | x < 0 = "Negativo"
    | otherwise = "Igual a zero"

posNeg2 :: Int -> String
posNeg2 x = if x > 0
    then "Positivo"
    else if x < 0
        then "Negativo"
    else "Igual a zero"

bissexto1 :: Int -> Bool
bissexto1 x = if mod x 400 == 0
    then True
    else if mod x 100 == 0
        then False
        else if mod x 4 == 0
            then True
            else False

bissexto2 :: Int -> Bool
bissexto2 x = if cond1
    then True
    else if cond2
        then False
        else if cond3
            then True
            else False
    where
        cond1 = mod x 400 == 0
        cond2 = mod x 100 == 0
        cond3 = mod x 4 == 0

bissexto3 :: Int -> Bool
bissexto3 x
    | cond1 = True
    | cond2 = False
    | cond3 = True
    | otherwise = False
    where
        cond1 = mod x 400 == 0
        cond2 = mod x 100 == 0
        cond3 = mod x 4 == 0