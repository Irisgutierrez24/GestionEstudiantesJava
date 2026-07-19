/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
/*
 * ==========================================================
 * PROYECTO: Sistema de Gestión de Estudiantes
 * Autor: Tu nombre
 *
 * Este programa demuestra el uso de:
 * - Clases
 * - Objetos
 * - Atributos
 * - Constructores
 * - Métodos
 * ==========================================================
 */

/*
 * La clase Estudiante representa a un estudiante.
 * No lleva la palabra "public" porque todo el código
 * está en un solo archivo llamado Main.java.
 * Prueba 1
 */
class Estudiante {

    // ============================
    // ATRIBUTOS
    // ============================

    // Guarda el nombre del estudiante.
    private String nombre;

    // Guarda la edad del estudiante.
    private int edad;

    // Guarda la matrícula del estudiante.
    private String matricula;

    // Guarda el promedio del estudiante.
    private double promedio;

    // ============================
    // CONSTRUCTOR
    // ============================

    /*
     * El constructor se ejecuta automáticamente
     * cuando se crea un nuevo objeto.
     *
     * Recibe los datos del estudiante y los guarda
     * en los atributos de la clase.
     */
    public Estudiante(String nombre, int edad, String matricula, double promedio) {

        // "this" hace referencia al atributo de la clase.

        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.promedio = promedio;

    }

    // ============================
    // MÉTODO mostrarInformacion()
    // ============================

    /*
     * Este método imprime toda la información
     * del estudiante.
     */
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);

        System.out.println("Edad: " + edad);

        System.out.println("Matrícula: " + matricula);

        System.out.println("Promedio: " + promedio);

    }

    // ============================
    // MÉTODO verificarAprobacion()
    // ============================

    /*
     * Comprueba si el estudiante aprobó.
     * Si el promedio es mayor o igual a 70,
     * el estudiante aprueba.
     */
    public void verificarAprobacion() {

        // Se evalúa la condición.

        if (promedio >= 70) {

            System.out.println("Resultado: APROBADO");

        } else {

            System.out.println("Resultado: REPROBADO");

        }

    }

}

/*
 * Clase principal del programa.
 *
 * La ejecución siempre inicia aquí.
 */
public class Main {

    /*
     * Método principal.
     *
     * Java ejecuta este método automáticamente
     * cuando inicia el programa.
     */
    public static void main(String[] args) {

        // ===================================
        // CREACIÓN DEL PRIMER OBJETO
        // ===================================

        /*
         * Se crea un objeto llamado estudiante1.
         *
         * "new" crea un nuevo objeto utilizando
         * el constructor de la clase Estudiante.
         */

        Estudiante estudiante1 = new Estudiante(

                // Nombre
                "Juan Pérez",

                // Edad
                20,

                // Matrícula
                "A001",

                // Promedio
                90.5

        );

        // ===================================
        // CREACIÓN DEL SEGUNDO OBJETO
        // ===================================

        Estudiante estudiante2 = new Estudiante(

                "María López",
                21,
                "A002",
                65.0

        );

        // ===================================
        // MOSTRAR DATOS DEL PRIMER ESTUDIANTE
        // ===================================

        System.out.println("===================================");

        System.out.println("ESTUDIANTE 1");

        System.out.println("===================================");

        // Llama al método que imprime la información.
        estudiante1.mostrarInformacion();

        // Llama al método que verifica si aprobó.
        estudiante1.verificarAprobacion();

        // Imprime una línea en blanco.
        System.out.println();

        // ===================================
        // MOSTRAR DATOS DEL SEGUNDO ESTUDIANTE
        // ===================================

        System.out.println("===================================");

        System.out.println("ESTUDIANTE 2");

        System.out.println("===================================");

        estudiante2.mostrarInformacion();

        estudiante2.verificarAprobacion();

    }

}
