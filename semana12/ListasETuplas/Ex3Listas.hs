inverteElem :: [Float] -> [Float]
inverteElem [] = []
inverteElem (h:t) = inverteElem t ++ [h]