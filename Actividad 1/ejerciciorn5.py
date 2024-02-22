import math #Importamos math para usar potencias

class ejerciciorn5: #Creamos la clase con el nombre "ejerciciorn5"

    #Inicializamos las variables
    suma = 0 
    x = 20
    y = 40

    #Realizamos los cálculos
    suma = suma + x
    x = x + math.pow(y, 2)
    suma = suma + (x/y)

    #Imprimimos por consola el resultado
    print("El valor de la suma es:", suma)
