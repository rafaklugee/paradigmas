soma :: [Int] -> Int
soma [] = 0
soma (h:t) = h + soma t