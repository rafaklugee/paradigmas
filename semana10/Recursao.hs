module Recursao where

fib :: Int -> Int
fib n
    | n == 0 = 0
    | n == 1 = 1
    | otherwise = fib(n-1) + fib(n-2)

contDig :: Int -> Int
contDig n 
    | n < 10 = 1
    | otherwise = 1 + contDig(n `div` 10)

somaDig:: Int -> Int
somaDig n 
    | n < 10 = n 
    | otherwise = somaDig(n `div` 10) + (n `mod` 10)