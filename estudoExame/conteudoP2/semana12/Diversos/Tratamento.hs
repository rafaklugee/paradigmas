sr :: String -> String
sr nome = "Sr. " ++ nome

sra :: String -> String
sra nome = "Sra. " ++ nome

srta :: String -> String
srta nome = "Srta. " ++ nome

tratamento :: [String] -> (String -> String) -> [String]
tratamento [] _ = []
tratamento (h:t) func = (func h) : tratamento t func