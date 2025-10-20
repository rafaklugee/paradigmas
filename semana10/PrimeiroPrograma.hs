module PrimeiroPrograma where

num 1 = 5.0
num 2 = 10.0
num 3 = 15.0
num 4 = 20.0
num 5 = 25.0

somaRec :: Int -> Double
somaRec 1 = num 1
somaRec n = num n + somaRec (n-1)

media :: Int -> Double
media n = somaRec n / fromIntegral n