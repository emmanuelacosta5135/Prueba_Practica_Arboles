// ============================================================
//  CLASE ESTUDIANTE
//  Guarda toda la información académica del estudiante
// ============================================================

public class Estudiante {

    // ---------------- ATRIBUTOS ----------------

    // Número de cédula del estudiante
    String cedula;

    // Apellidos del estudiante
    String apellidos;

    // Nombres del estudiante
    String nombres;

    // Nota final obtenida
    double notaFinal;

    // Carrera universitaria
    String carrera;

    // Nivel o semestre
    int nivel;


    // ---------------- CONSTRUCTOR ----------------
    // Inicializa todos los datos del estudiante

    public Estudiante(String cedula,
                      String apellidos,
                      String nombres,
                      double notaFinal,
                      String carrera,
                      int nivel) {

        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
        this.nivel = nivel;
    }


    // ---------------- TOSTRING ----------------
    // Devuelve todos los datos del estudiante
    // en formato organizado

    @Override
    public String toString() {

        return String.format(
            "Cedula: %s\n" +
            "Apellidos: %s\n" +
            "Nombres: %s\n" +
            "Nota: %.2f\n" +
            "Carrera: %s\n" +
            "Nivel: %d\n",

            cedula,
            apellidos,
            nombres,
            notaFinal,
            carrera,
            nivel
        );
    }
}
