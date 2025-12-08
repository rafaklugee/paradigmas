module Listas where

somaLista :: [Int] -> Int
somaLista [] = 0
somaLista (h:t) = h + somaLista t

removePar :: [Int] -> [Int]
removePar [] = []
removePar (h:t)
    | mod h 2 == 1 = h : removePar t
    | otherwise = removePar t

inverteElem :: [Double] -> [Double]
inverteElem [] = []
inverteElem (h:t) = inverteElem t ++ [h]

apenasA :: [String] -> [String]
apenasA [] = []
apenasA (h:t)
    | head h == 'A' = h : apenasA t
    | otherwise = apenasA t