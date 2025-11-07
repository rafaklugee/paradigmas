module Multiplos where

multiplos :: Int -> [Int]
multiplos n = [n * x | x <- [1 .. 10]]