type Ponto = String
type Nota = Int
type Tipo = String
type PontoTuristico = (Ponto, Nota, Tipo)
type TodosPontos = [PontoTuristico]

turismo :: Int -> TodosPontos -> [(Ponto, Nota)]
turismo x pontos = [ (ponto, nota) | (ponto, nota, tipo) <- pontos, nota > x, tipo == "parque" || tipo == "museu"]
