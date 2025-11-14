type Aluno = (String, Float)
aprovado :: Aluno -> Bool
aprovado (nome, media)
    | media >= 6 = True
    | otherwise = False