// ============================================================
//  CLASE NODO
//  Representa cada nodo del árbol binario
// ============================================================

public class Nodo {

    // ---------------- ATRIBUTOS ----------------

    // Datos almacenados dentro del nodo
    Estudiante datos;

    // Referencia al hijo izquierdo
    Nodo izq;

    // Referencia al hijo derecho
    Nodo der;


    // ---------------- CONSTRUCTOR ----------------
    // Crea un nodo con los datos del estudiante

    public Nodo(Estudiante datos) {

        // Guarda el estudiante
        this.datos = datos;

        // Inicialmente no tiene hijos
        this.izq = null;
        this.der = null;
    }
}
