// Ejemplo de una lista personalizada genérica en Java
import java.util.ArrayList;

class CustomList<T> {       // Clase genérica
    private ArrayList<T> list;

    public CustomList() {
        list = new ArrayList<>();   // Inicializa la lista
    }

    public void add(T element) {
        list.add(element);  // Agrega un elemento a la lista
    }

    public void remove(T element) {
        list.remove(element);   // Remueve un elemento de la lista
    }

    public int size() {
        return list.size();    // Devuelve el tamaño de la lista
    }

    public boolean contains(T element) {
        return list.contains(element);  // Devuelve true si el elemento está en la lista, false en caso contrario
    }
}

public class Main {   // Clase principal
    public static void main(String[] args) {    // Método principal
        CustomList<Integer> customList = new CustomList<>();    // Instancia de la clase CustomList
        customList.add(1);  // Agrega elementos a la lista
        customList.add(2);
        customList.add(3);
        System.out.println("Size of list: " + customList.size());   // Imprime el tamaño de la lista
        System.out.println("Contains 2: " + customList.contains(2));        
        customList.remove(2);   // Remueve el elemento 2 de la lista
        System.out.println("Contains 2 after removal: " + customList.contains(2));   
    }
}
