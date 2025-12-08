base :: Int -> (String, String, Char)
base x
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", "x", 'x')

type Nome = String
type Titulo = String
type Genero = Char
type Pesquisador = (Nome, Titulo, Genero)
type Grupo = [Pesquisador]

criaLista :: Int -> Grupo
criaLista 0 = []
criaLista n = pesquisador : criaLista(n-1)
    where
        pesquisador = base n

doutores :: Grupo -> [Nome]
doutores ((nome, titulo, genero):t) = [nome | (nome, titulo, genero) <- ((nome, titulo, genero):t), titulo == "doutor"]
-- doutores pesquisadores = [nome | (nome, titulo, genero) <- pesquisadores, titulo == "doutor"]