type NomeAluno = String
type MediaNota = Int
type Aluno = (NomeAluno, MediaNota)
type Turma = [Aluno]

aprovados :: MediaNota -> Turma -> [String]
aprovados nota turma = [aluno | (aluno, media) <- turma, media >= nota ]