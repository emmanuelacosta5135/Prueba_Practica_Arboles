// ============================================================
// Archivo: Main.java
// ============================================================

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArbolBST arbol = new ArbolBST();

        // DATOS DE PRUEBA

        arbol.insertarEstudiante(
                new Estudiante(
                        "1801",
                        "Alvarez",
                        "Carlos",
                        18,
                        "Sistemas",
                        3
                )
        );

        arbol.insertarEstudiante(
                new Estudiante(
                        "1802",
                        "Lopez",
                        "Ana",
                        15,
                        "Civil",
                        2
                )
        );

        int opcion;

        do {

            mostrarMenu();

            opcion = leerEntero();

            switch (opcion) {

                case 1 -> insertar(arbol);

                case 2 -> {
                    System.out.print("Cedula: ");
                    arbol.buscarEstudiante(
                            sc.nextLine()
                    );
                }

                case 3 -> {
                    System.out.print("Cedula: ");
                    arbol.eliminarEstudiante(
                            sc.nextLine()
                    );
                }

                case 4 -> arbol.recorridoInorden();

                case 5 -> arbol.recorridoPreorden();

                case 6 -> arbol.recorridoPostorden();

                case 7 -> arbol.recorridoPorNiveles();

                case 8 -> arbol.contarNodos();

                case 9 -> arbol.calcularAltura();

                case 10 ->
                        System.out.println("Fin.");

                default ->
                        System.out.println("Opcion invalida.");
            }

        } while (opcion != 10);
    }

    // ========================================================

    static void mostrarMenu() {

        System.out.println("\n========= MENU =========");

        System.out.println("1. Insertar");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("4. Inorden");
        System.out.println("5. Preorden");
        System.out.println("6. Postorden");
        System.out.println("7. BFS");
        System.out.println("8. Contar nodos");
        System.out.println("9. Altura");
        System.out.println("10. Salir");

        System.out.print("Opcion: ");
    }

    // ========================================================

    static void insertar(ArbolBST arbol) {

        System.out.print("Cedula: ");
        String cedula = sc.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Nota: ");
        double nota = Double.parseDouble(
                sc.nextLine()
        );

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Nivel: ");
        int nivel = leerEntero();

        arbol.insertarEstudiante(
                new Estudiante(
                        cedula,
                        apellidos,
                        nombres,
                        nota,
                        carrera,
                        nivel
                )
        );
    }

    // ========================================================

    static int leerEntero() {

        while (true) {

            try {
                return Integer.parseInt(
                        sc.nextLine()
                );

            } catch (Exception e) {

                System.out.print(
                        "Ingrese numero valido: "
                );
            }
        }
    }
}
