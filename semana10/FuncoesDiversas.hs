module FuncoesDiversas where

-- Soma de quadrados
-- somaQua1 :: Float -> Float -> Float -> Float
-- somaQua1 x y z = x^2 + y^2 + z^2

somaQua2 :: Float -> Float -> Float -> Float
somaQua2 x y z = x ** 2 + y ** 2 + z ** 2

somaQua3 :: Int -> Int -> Int -> Int
somaQua3 x y z = x^2 + y^2 + z^2

-- Verificar se é ímpar
ehImpar1 :: Int -> Bool
ehImpar1 x = not (even x)

ehImpar2 :: Int -> Bool
ehImpar2 x
    | x `mod` 2 == 1 = True
    | otherwise = False