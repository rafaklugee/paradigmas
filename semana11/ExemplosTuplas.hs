module ExemplosTuplas where

contar :: [Int] -> (Int, Int)
contar [] = (0, 0)
contar (h:t)
    | mod h 2 == 0 = (pares + 1, impares)
    | otherwise = (pares, impares + 1)
    where
        (pares, impares) = contar t

-- Ver o erro [...]
type NomeAluno = String
type MediaNota = Int
type Aluno = (NomeAluno, MediaNota)
type Turma = [Aluno]
aprovados :: Turma -> Int -> [NomeAluno]
aprovados tma nota = [nome | (nome, media) <- tma, media >= nota]