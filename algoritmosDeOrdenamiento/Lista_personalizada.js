// Ejemplo lista personalizada Javascript
class CustomList {     
    constructor() {
        this.list = [];
    }

    add(element) {      // Agregar un elemento a la lista
        this.list.push(element);
    }

    remove(element) {   // Remover un elemento de la lista
        const index = this.list.indexOf(element);
        if (index !== -1) {
            this.list.splice(index, 1);
        }
    }

    size() {        // Obtener el tamaño de la lista
        return this.list.length;
    }

    contains(element) {     // Verificar si un elemento está en la lista
        return this.list.includes(element);
    }
}

let customList = new CustomList();
customList.add(1);
customList.add(2);
customList.add(3);
console.log("Size of list:", customList.size());
console.log("Contains 2:", customList.contains(2));
customList.remove(2);
console.log("Contains 2 after removal:", customList.contains(2));
