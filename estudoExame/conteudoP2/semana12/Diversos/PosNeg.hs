positivo :: Double -> Bool
positivo n
    | n > 0 = True
    | otherwise = False

negativo :: Double -> Bool
negativo n
    | n < 0 = True
    | otherwise = False

ehZero :: Double -> Bool
ehZero n
    | n == 0 = True
    | otherwise = False

filtro :: [Double] -> (Double -> Bool) -> [Double]
filtro [] _ = []
filtro (h:t) func
    | (func h) == True = h : filtro t func
    | otherwise = filtro t func