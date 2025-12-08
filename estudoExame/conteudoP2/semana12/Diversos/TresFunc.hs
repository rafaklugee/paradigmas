retorna1 :: (String, String, Char) -> String
retorna1 (nome, _, _) = nome;

retorna2 :: (String, String, Char) -> String
retorna2 (_, sobrenome, _) = sobrenome;

retorna3 :: (String, String, Char) -> Char
retorna3 (_, _, letra) = letra;