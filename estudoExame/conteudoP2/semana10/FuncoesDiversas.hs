module FuncoesDiversas where

-- Soma dos quadrados
somaQua1 :: Int -> Int -> Int -> Int
somaQua1 x y z = x*x + y*y + z*z

somaQua2 :: Float -> Float -> Float -> Float
somaQua2 x y z = x**2 + y**2 + z**2

somaQua3 :: Int -> Int -> Int -> Int
somaQua3 x y z = x^2 + y^2 + z^2

ehImpar1 :: Int -> Bool
ehImpar1 x = not (even x)

ehImpar2 :: Int -> Bool
ehImpar2 x
    | mod x 2 == 0 = False
    | otherwise = True