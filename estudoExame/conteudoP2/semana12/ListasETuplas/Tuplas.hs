module Tuplas where

multiplica :: Int -> (Int, Int, Int, Int)
multiplica n = (2*n, 3*n, 4*n, 5*n)

divImparPar :: Int -> (Int, String)
divImparPar n = (div n 2, parImpar n)
    where
        parImpar x
            | mod x 2 == 0 = "Par"
            | otherwise = "Impar"

posNeg :: [Int] -> (Int, Int)
posNeg [] = (0, 1)
posNeg (h:t)
    | h >= 0 = (positivos + h, negativos)
    | otherwise = (positivos, negativos * h)
    where
        (positivos, negativos) = posNeg t

type Nome = String
type Nota = Int
type Tipo = String
type PontoTuristico = (Nome, Nota, Tipo)
type PontoTuristicoRetorno = (Nome, Nota)

turismo :: Int -> [PontoTuristico] -> [PontoTuristicoRetorno]
turismo n ((nome, nota, tipo):t) = [(nome, nota) | (nome, nota, tipo) <- ((nome, nota, tipo):t), nota > n, tipo == "parque" || tipo == "museu"]
-- turismo x pontos = [ (nome, nota) | (nome, nota, tipo) <- pontos, nota > x, tipo == "parque" || tipo == "museu"]