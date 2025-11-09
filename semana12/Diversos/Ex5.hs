ehPositivo :: Float -> Bool
ehPositivo x
    | x > 0 = True
    | otherwise = False

ehNegativo :: Float -> Bool
ehNegativo x
    | x < 0 = True
    | otherwise = False

ehNulo :: Float -> Bool
ehNulo x
    | x == 0 = True
    | otherwise = False

ehOQue :: [Float] -> (Float -> Bool) -> [Float]
ehOQue [] _ = []
ehOQue (h:t) func
    | (func h) == True = h : ehOQue t func
    | otherwise = ehOQue t func