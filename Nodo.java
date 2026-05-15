// ============================================================
// Archivo: Nodo.java
// ============================================================

public class Nodo {

    Estudiante datos;
    Nodo izq;
    Nodo der;

    public Nodo(Estudiante datos) {
        this.datos = datos;
        this.izq = null;
        this.der = null;
    }
}
