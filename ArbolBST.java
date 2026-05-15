// ============================================================
// Archivo: ArbolBST.java
// ============================================================

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBST {

    private Nodo raiz;

    public ArbolBST() {
        raiz = null;
    }

    // ========================================================
    // INSERTAR
    // ========================================================

    public void insertarEstudiante(Estudiante e) {
        raiz = insertar(raiz, e);
    }

    private Nodo insertar(Nodo nodo, Estudiante e) {

        if (nodo == null)
            return new Nodo(e);

        int cmp = e.cedula.compareTo(nodo.datos.cedula);

        if (cmp < 0)
            nodo.izq = insertar(nodo.izq, e);

        else if (cmp > 0)
            nodo.der = insertar(nodo.der, e);

        else
            System.out.println("  [!] Cedula duplicada.");

        return nodo;
    }

    // ========================================================
    // BUSCAR
    // ========================================================

    public void buscarEstudiante(String cedula) {

        Nodo resultado = buscar(raiz, cedula);

        if (resultado != null)
            System.out.println(resultado.datos);

        else
            System.out.println("  [!] Estudiante no encontrado.");
    }

    private Nodo buscar(Nodo nodo, String cedula) {

        if (nodo == null ||
                nodo.datos.cedula.equals(cedula))
            return nodo;

        int cmp = cedula.compareTo(nodo.datos.cedula);

        if (cmp < 0)
            return buscar(nodo.izq, cedula);

        return buscar(nodo.der, cedula);
    }

    // ========================================================
    // ELIMINAR
    // ========================================================

    public void eliminarEstudiante(String cedula) {
        raiz = eliminar(raiz, cedula);
    }

    private Nodo eliminar(Nodo nodo, String cedula) {

        if (nodo == null) {
            System.out.println("  [!] Estudiante no encontrado.");
            return null;
        }

        int cmp = cedula.compareTo(nodo.datos.cedula);

        if (cmp < 0) {
            nodo.izq = eliminar(nodo.izq, cedula);
        }

        else if (cmp > 0) {
            nodo.der = eliminar(nodo.der, cedula);
        }

        else {

            if (nodo.izq == null)
                return nodo.der;

            if (nodo.der == null)
                return nodo.izq;

            Nodo sucesor = minimoNodo(nodo.der);

            nodo.datos = sucesor.datos;

            nodo.der = eliminar(
                    nodo.der,
                    sucesor.datos.cedula
            );
        }

        return nodo;
    }

    private Nodo minimoNodo(Nodo nodo) {

        while (nodo.izq != null)
            nodo = nodo.izq;

        return nodo;
    }

    // ========================================================
    // INORDEN
    // ========================================================

    public void recorridoInorden() {

        System.out.println("\n=== INORDEN ===");

        inorden(raiz);
    }

    private void inorden(Nodo nodo) {

        if (nodo == null)
            return;

        inorden(nodo.izq);

        System.out.println(nodo.datos);

        inorden(nodo.der);
    }

    // ========================================================
    // PREORDEN
    // ========================================================

    public void recorridoPreorden() {

        System.out.println("\n=== PREORDEN ===");

        preorden(raiz);
    }

    private void preorden(Nodo nodo) {

        if (nodo == null)
            return;

        System.out.println(nodo.datos);

        preorden(nodo.izq);

        preorden(nodo.der);
    }

    // ========================================================
    // POSTORDEN
    // ========================================================

    public void recorridoPostorden() {

        System.out.println("\n=== POSTORDEN ===");

        postorden(raiz);
    }

    private void postorden(Nodo nodo) {

        if (nodo == null)
            return;

        postorden(nodo.izq);

        postorden(nodo.der);

        System.out.println(nodo.datos);
    }

    // ========================================================
    // BFS
    // ========================================================

    public void recorridoPorNiveles() {

        if (raiz == null) {
            System.out.println("  Arbol vacio.");
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();

        cola.add(raiz);

        while (!cola.isEmpty()) {

            Nodo actual = cola.poll();

            System.out.println(actual.datos);

            if (actual.izq != null)
                cola.add(actual.izq);

            if (actual.der != null)
                cola.add(actual.der);
        }
    }

    // ========================================================
    // CONTAR NODOS
    // ========================================================

    public void contarNodos() {

        System.out.println(
                "Total nodos: " + contar(raiz)
        );
    }

    private int contar(Nodo nodo) {

        if (nodo == null)
            return 0;

        return 1 +
                contar(nodo.izq) +
                contar(nodo.der);
    }

    // ========================================================
    // ALTURA
    // ========================================================

    public void calcularAltura() {

        System.out.println(
                "Altura: " + altura(raiz)
        );
    }

    private int altura(Nodo nodo) {

        if (nodo == null)
            return 0;

        return 1 + Math.max(
                altura(nodo.izq),
                altura(nodo.der)
        );
    }
}
