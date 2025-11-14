somaNum :: [Int] -> (Int, Int)
somaNum [] = (0, 1)
somaNum (h:t)
    | h >= 0 = (h + positivos, negativos)
    | otherwise = (positivos, h * negativos)
    where
        (positivos, negativos) = somaNum t
