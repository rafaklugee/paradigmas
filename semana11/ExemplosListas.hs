module ExemplosListas where

comp :: [Int] -> Int
comp [] = 0
comp (h:t) = 1 + comp t

cubo :: Int -> Int
cubo x = x * x * x

aoCubo :: [Int] -> [Int]
aoCubo [] = []
aoCubo (h:t) = cubo h : aoCubo t