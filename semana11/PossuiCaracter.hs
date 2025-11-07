module PossuiCaracter where

possuiChar :: [Char] -> Char -> Bool
possuiChar [] ch = False
possuiChar (h:t) ch
    | h == ch = True
    | otherwise = possuiChar t ch