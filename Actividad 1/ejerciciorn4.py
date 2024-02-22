class ejerciciorn4: #Creamos la clase con el nombre "ejerciciorn4"

    edJuan = 9 #Usamos 9 para hacer la prueba de escritorio

    #Calculamos las edades
    edAlber = int(2*(edJuan/3))
    edAna = int(4*(edJuan/3))
    edMama = edJuan + edAlber + edAna

    #Imprimimos por consola las edades
    print("Las edades son:")
    print("Alberto: " + str(edAlber))
    print("Juan: " + str(edJuan))
    print("Ana: " + str(edAna))
    print("Mamá: " + str(edMama))
