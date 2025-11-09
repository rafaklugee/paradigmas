sr :: String -> String
sr nome = "Sr. " ++ nome

sra :: String -> String
sra nome = "Sra. " ++ nome

srta :: String -> String
srta nome = "Srta. " ++ nome

pronome :: String -> String
pronome nome
    | last nome == 'a' = sra nome
    | otherwise = sr nome

tratamento :: [String] -> (String -> String) -> [String]
tratamento [] _ = []
tratamento (h:t) func = (func h) : tratamento t func 