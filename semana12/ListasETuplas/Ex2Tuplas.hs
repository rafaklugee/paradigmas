parImpar :: Int -> (Int, String)
parImpar x = (div x 2, ehparimpar x)
    where 
        ehparimpar x 
            | mod x 2 == 0 = "Par"
            | otherwise = "Impar"