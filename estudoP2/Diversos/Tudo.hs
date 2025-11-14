verificaAluno :: (String, Float) -> String
verificaAluno (_, media)
    | media >= 6 = "Aprovado"
    | media >= 4 && media <= 5.9 = "Recuperacao"
    | otherwise = "Reprovado"

somaPositivos :: [Int] -> Int
somaPositivos [] = 0
somaPositivos (h:t)
    | h > 0 = h + somaPositivos t
    | otherwise = somaPositivos t

type Alunos = (String, Float)
type Turma = [Alunos]
somaMedia :: Turma -> Float
somaMedia turma = sum [media | (nome, media) <- turma, head nome == 'A']

-- letrasMaiusculas: não!

transformaLista :: [Int] -> [Int]
transformaLista [] = []
transformaLista (h:t)
    | mod h 2 == 0 = 3 * h : transformaLista t
    | otherwise = 2 * h : transformaLista t

-- main: não!

aplicaFuncoes :: [Int] -> [Int]
aplicaFuncoes lista = [x * 2 + 1 | x <- lista]

multiplosDe5 :: [Int]
multiplosDe5 = [x * 5 | x <- [1 .. 10]]

mediaLista :: [Float] -> Float
mediaLista [] = 0
mediaLista lista = soma lista / fromIntegral (cont lista)
    where
        soma [] = 0
        soma (h:t) = h + soma t
        cont [] = 0
        cont (h:t) = 1 + cont t