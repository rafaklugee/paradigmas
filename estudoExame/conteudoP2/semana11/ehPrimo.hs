ehPrimo :: Int -> Bool
ehPrimo n
    | n < 2 = False
    | otherwise = length [x | x <- [1..n], mod n x == 0] == 2