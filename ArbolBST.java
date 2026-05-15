// ============================================================
//  CLASE ARBOLBST
//  Contiene toda la lógica del árbol binario de búsqueda
// ============================================================

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBST {

    // ---------------- ATRIBUTO PRINCIPAL ----------------

    // Nodo raíz del árbol
    private Nodo raiz;


    // ---------------- CONSTRUCTOR ----------------
    // Crea un árbol vacío

    public ArbolBST() {
        raiz = null;
    }


    // ====================================================
    // INSERTAR ESTUDIANTE
    // ====================================================

    // Método público para insertar
    public void insertarEstudiante(Estudiante e) {

        // Llama al método recursivo
        raiz = insertar(raiz, e);
    }

    // Método recursivo de inserción
    private Nodo insertar(Nodo nodo, Estudiante e) {

        // Si el nodo es null se crea uno nuevo
        if (nodo == null)
            return new Nodo(e);

        // Comparar cédulas
        int cmp = e.cedula.compareTo(nodo.datos.cedula);

        // Si es menor -> izquierda
        if (cmp < 0)
            nodo.izq = insertar(nodo.izq, e);

        // Si es mayor -> derecha
        else if (cmp > 0)
            nodo.der = insertar(nodo.der, e);

        // Si ya existe
        else
            System.out.println("Cedula duplicada.");

        return nodo;
    }


    // ====================================================
    // BUSCAR ESTUDIANTE
    // ====================================================

    public void buscarEstudiante(String cedula) {

        Nodo resultado = buscar(raiz, cedula);

        // Mostrar si existe
        if (resultado != null)
            System.out.println(resultado.datos);

        // Mensaje de error
        else
            System.out.println("Estudiante no encontrado.");
    }

    // Método recursivo de búsqueda
    private Nodo buscar(Nodo nodo, String cedula) {

        // Caso base
        if (nodo == null ||
            nodo.datos.cedula.equals(cedula))
            return nodo;

        // Comparar cédulas
        int cmp = cedula.compareTo(nodo.datos.cedula);

        // Buscar izquierda
        if (cmp < 0)
            return buscar(nodo.izq, cedula);

        // Buscar derecha
        return buscar(nodo.der, cedula);
    }


    // ====================================================
    // ELIMINAR ESTUDIANTE
    // ====================================================

    public void eliminarEstudiante(String cedula) {

        raiz = eliminar(raiz, cedula);
    }

    // Método recursivo de eliminación
    private Nodo eliminar(Nodo nodo, String cedula) {

        // Nodo no encontrado
        if (nodo == null)
            return null;

        int cmp = cedula.compareTo(nodo.datos.cedula);

        // Buscar izquierda
        if (cmp < 0) {

            nodo.izq = eliminar(nodo.izq, cedula);
        }

        // Buscar derecha
        else if (cmp > 0) {

            nodo.der = eliminar(nodo.der, cedula);
        }

        // Nodo encontrado
        else {

            // Caso 1: sin hijo izquierdo
            if (nodo.izq == null)
                return nodo.der;

            // Caso 2: sin hijo derecho
            if (nodo.der == null)
                return nodo.izq;

            // Caso 3: dos hijos
            Nodo sucesor = minimoNodo(nodo.der);

            // Reemplazar datos
            nodo.datos = sucesor.datos;

            // Eliminar sucesor
            nodo.der = eliminar(
                nodo.der,
                sucesor.datos.cedula
            );
        }

        return nodo;
    }


    // ====================================================
    // BUSCAR NODO MÍNIMO
    // ====================================================

    // Obtiene el nodo más pequeño
    private Nodo minimoNodo(Nodo nodo) {

        while (nodo.izq != null)
            nodo = nodo.izq;

        return nodo;
    }


    // ====================================================
    // RECORRIDO INORDEN
    // ====================================================

    public void recorridoInorden() {

        inorden(raiz);
    }

    // Izquierda -> Raíz -> Derecha
    private void inorden(Nodo nodo) {

        if (nodo == null)
            return;

        inorden(nodo.izq);

        System.out.println(nodo.datos);

        inorden(nodo.der);
    }


    // ====================================================
    // RECORRIDO PREORDEN
    // ====================================================

    public void recorridoPreorden() {

        preorden(raiz);
    }

    // Raíz -> Izquierda -> Derecha
    private void preorden(Nodo nodo) {

        if (nodo == null)
            return;

        System.out.println(nodo.datos);

        preorden(nodo.izq);

        preorden(nodo.der);
    }


    // ====================================================
    // RECORRIDO POSTORDEN
    // ====================================================

    public void recorridoPostorden() {

        postorden(raiz);
    }

    // Izquierda -> Derecha -> Raíz
    private void postorden(Nodo nodo) {

        if (nodo == null)
            return;

        postorden(nodo.izq);

        postorden(nodo.der);

        System.out.println(nodo.datos);
    }


    // ====================================================
    // RECORRIDO BFS POR NIVELES
    // ====================================================

    public void recorridoPorNiveles() {

        // Si el árbol está vacío
        if (raiz == null)
            return;

        // Cola para BFS
        Queue<Nodo> cola = new LinkedList<>();

        // Insertar raíz
        cola.add(raiz);

        while (!cola.isEmpty()) {

            // Obtener frente
            Nodo actual = cola.poll();

            // Mostrar nodo
            System.out.println(actual.datos);

            // Insertar hijos
            if (actual.izq != null)
                cola.add(actual.izq);

            if (actual.der != null)
                cola.add(actual.der);
        }
    }


    // ====================================================
    // CONTAR NODOS
    // ====================================================

    public void contarNodos() {

        System.out.println(
            "Total: " + contarNodos(raiz)
        );
    }

    // Conteo recursivo
    private int contarNodos(Nodo nodo) {

        if (nodo == null)
            return 0;

        return 1 +
               contarNodos(nodo.izq) +
               contarNodos(nodo.der);
    }


    // ====================================================
    // CALCULAR ALTURA
    // ====================================================

    public void calcularAltura() {

        System.out.println(
            "Altura: " + calcularAltura(raiz)
        );
    }

    // Altura recursiva
    private int calcularAltura(Nodo nodo) {

        if (nodo == null)
            return 0;

        return 1 + Math.max(
            calcularAltura(nodo.izq),
            calcularAltura(nodo.der)
        );
    }
}
