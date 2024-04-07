# Ejemplo lista personalizada con Python
class CustomList:       
    def __init__(self):     
        self.list = []

    def add(self, element):     # Método para agregar un elemento a la lista
        self.list.append(element)

    def remove(self, element):  # Método para remover un elemento de la lista
        self.list.remove(element)

    def size(self):            # Método para obtener el tamaño de la lista
        return len(self.list)

    def contains(self, element):    # Método para verificar si un elemento está en la lista
        return element in self.list

custom_list = CustomList()   # Crear una lista personalizada
custom_list.add(1)          # Agregar elementos a la lista
custom_list.add(2)
custom_list.add(3)
print("Size of list:", custom_list.size())  
print("Contains 2:", custom_list.contains(2))
custom_list.remove(2)
print("Contains 2 after removal:", custom_list.contains(2))
