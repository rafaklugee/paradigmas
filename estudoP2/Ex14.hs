contaParesRec :: [Int] -> Int
contaParesRec [] = 0
contaParesRec (h:t)
    | mod h 2 == 0 = 1 + contaParesRec t
    | otherwise = contaParesRec t

contaParesRec2 :: [Int] -> Int
contaParesRec2 [] = 0
contaParesRec2 (h:t) = if mod h 2 == 0
        then 1 + contaParesRec2 t
        else
            contaParesRec2 t