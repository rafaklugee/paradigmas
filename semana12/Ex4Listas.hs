nomesComA :: [String] -> [String]
nomesComA [] = []
nomesComA (h:t)
    | head h == 'A' = h : nomesComA t
    | otherwise = nomesComA t