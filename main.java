// ============================================================
//  CLASE PRINCIPAL
//  Controla el menú y la interacción del usuario
// ============================================================

import java.util.Scanner;

public class ArbolEstudiantes {

    // Scanner global para leer datos
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Crear árbol
        ArbolBST arbol = new ArbolBST();

        // Variable del menú
        int opcion;

        do {

            // Mostrar menú
            mostrarMenu();

            // Leer opción
            opcion = leerEntero();

            switch (opcion) {

                // Insertar estudiante
                case 1 -> {

                    arbol.insertarEstudiante(
                        leerEstudiante()
                    );
                }

                // Buscar estudiante
                case 2 -> {

                    System.out.print("Cedula: ");

                    arbol.buscarEstudiante(
                        sc.nextLine()
                    );
                }

                // Recorrido inorden
                case 3 -> {

                    arbol.recorridoInorden();
                }

                // Salir
                case 4 -> {

                    System.out.println("Hasta luego");
                }

                // Opción inválida
                default -> {

                    System.out.println("Opcion invalida");
                }
            }

        } while (opcion != 4);
    }


    // ====================================================
    // MOSTRAR MENÚ
    // ====================================================

    static void mostrarMenu() {

        System.out.println("\n===== MENU =====");

        System.out.println("1. Insertar");
        System.out.println("2. Buscar");
        System.out.println("3. Inorden");
        System.out.println("4. Salir");

        System.out.print("Opcion: ");
    }


    // ====================================================
    // LEER ESTUDIANTE
    // ====================================================

    static Estudiante leerEstudiante() {

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

        // Retorna nuevo estudiante
        return new Estudiante(
            cedula,
            apellidos,
            nombres,
            nota,
            carrera,
            nivel
        );
    }


    // ====================================================
    // LEER ENTERO
    // ====================================================

    // Controla errores numéricos
    static int leerEntero() {

        while (true) {

            try {

                return Integer.parseInt(
                    sc.nextLine()
                );

            } catch (NumberFormatException e) {

                System.out.print(
                    "Numero invalido: "
                );
            }
        }
    }
}
