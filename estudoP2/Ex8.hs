paresDobro :: [Int] -> [Int]
paresDobro lista = [2 * par | par <- lista, mod par 2 == 0 ]