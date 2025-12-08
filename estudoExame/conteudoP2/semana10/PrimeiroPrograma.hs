module PrimeiroPrograma where

-- Base de dados
num 1 = 5
num 2 = 10
num 3 = 15
num 4 = 20
num 5 = 25

-- Função recursiva
somaRec :: Int -> Float
somaRec 1 = num 1
somaRec n = num n + somaRec(n-1)

media :: Int -> Float
media n = somaRec n / fromIntegral n