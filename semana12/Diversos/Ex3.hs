base :: Int -> (String, String, Char)
base x
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", "", 'x')

type Nome = String
type Titulo = String
type Genero = Char
type Pesquisador = (String, String, Char)
type Grupo = [Pesquisador]

formaLista :: Int -> Grupo
formaLista 0 = []
formaLista x = base x : formaLista (x-1)

doutores :: Grupo -> [String]
doutores grupo = [nome | (nome, titulo, genero) <- grupo, titulo == "doutor"]
