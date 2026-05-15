// ============================================================
// Archivo: Estudiante.java
// ============================================================

public class Estudiante {

    String cedula;
    String apellidos;
    String nombres;
    double notaFinal;
    String carrera;
    int nivel;

    public Estudiante(String cedula, String apellidos, String nombres,
                      double notaFinal, String carrera, int nivel) {

        this.cedula = cedula;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.notaFinal = notaFinal;
        this.carrera = carrera;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return String.format(
                "  ------------------------------------------\n" +
                        "  Cedula   : %s\n" +
                        "  Apellidos: %s\n" +
                        "  Nombres  : %s\n" +
                        "  Nota     : %.2f\n" +
                        "  Carrera  : %s\n" +
                        "  Nivel    : %d\n",
                cedula, apellidos, nombres,
                notaFinal, carrera, nivel
        );
    }
}
