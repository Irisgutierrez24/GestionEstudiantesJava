/*
 * ==========================================================
 * PROYECTO: Sistema de Gestión de Estudiantes con Herencia
 * Autor: Iris Sarahi Gutiérrez Gamboa
 *
 * Esta aplicación demuestra el uso de:
 * - Clases
 * - Objetos
 * - Herencia
 * - Constructores
 * - Sobrescritura de métodos (@Override)
 * - Reutilización de código
 * ==========================================================
 */

//============================================================
// CLASE PADRE (SUPERCLASE)
//============================================================

// La clase Persona almacena la información común de cualquier persona.
class Persona {

    // Atributo protegido para que pueda ser utilizado por las clases hijas.
    protected String nombre;

    // Atributo protegido para almacenar la edad.
    protected int edad;

    // Constructor de la clase Persona.
    public Persona(String nombre, int edad) {

        // Inicializa el atributo nombre.
        this.nombre = nombre;

        // Inicializa el atributo edad.
        this.edad = edad;
    }

    // Método que muestra la información básica de la persona.
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

//============================================================
// CLASE HIJA
//============================================================

// La clase Estudiante hereda todos los atributos y métodos de Persona.
class Estudiante extends Persona {

    // Matrícula del estudiante.
    protected String matricula;

    // Promedio del estudiante.
    protected double promedio;

    // Constructor de la clase Estudiante.
    public Estudiante(String nombre,
                      int edad,
                      String matricula,
                      double promedio) {

        // Llama al constructor de la clase Persona.
        super(nombre, edad);

        // Inicializa la matrícula.
        this.matricula = matricula;

        // Inicializa el promedio.
        this.promedio = promedio;
    }

    // Sobrescribe el método mostrarInformacion().
    @Override
    public void mostrarInformacion() {

        // Muestra la información heredada.
        super.mostrarInformacion();

        // Muestra la matrícula.
        System.out.println("Matrícula: " + matricula);

        // Muestra el promedio.
        System.out.println("Promedio: " + promedio);
    }

    // Verifica si el estudiante aprobó.
    public void verificarAprobacion() {

        if (promedio >= 70) {

            System.out.println("Resultado: APROBADO");

        } else {

            System.out.println("Resultado: REPROBADO");

        }

    }

}

//============================================================
// SUBCLASE ESTUDIANTE DE LICENCIATURA
//============================================================

// Hereda de Estudiante.
class EstudianteLicenciatura extends Estudiante {

    // Carrera del estudiante.
    private String carrera;

    // Constructor.
    public EstudianteLicenciatura(String nombre,
                                  int edad,
                                  String matricula,
                                  double promedio,
                                  String carrera) {

        // Llama al constructor de Estudiante.
        super(nombre, edad, matricula, promedio);

        // Inicializa la carrera.
        this.carrera = carrera;

    }

    // Sobrescribe el método heredado.
    @Override
    public void mostrarInformacion() {

        System.out.println("=================================");
        System.out.println("ESTUDIANTE DE LICENCIATURA");
        System.out.println("=================================");

        // Muestra la información heredada.
        super.mostrarInformacion();

        // Muestra la carrera.
        System.out.println("Carrera: " + carrera);

    }

    // Método exclusivo.
    public void realizarServicioSocial() {

        System.out.println("Servicio social: EN PROCESO");

    }

}

//============================================================
// SUBCLASE ESTUDIANTE DE POSGRADO
//============================================================

// Hereda de Estudiante.
class EstudiantePosgrado extends Estudiante {

    // Línea de investigación.
    private String lineaInvestigacion;

    // Constructor.
    public EstudiantePosgrado(String nombre,
                              int edad,
                              String matricula,
                              double promedio,
                              String lineaInvestigacion) {

        // Llama al constructor del padre.
        super(nombre, edad, matricula, promedio);

        // Inicializa la línea de investigación.
        this.lineaInvestigacion = lineaInvestigacion;

    }

    // Sobrescribe mostrarInformacion().
    @Override
    public void mostrarInformacion() {

        System.out.println("=================================");
        System.out.println("ESTUDIANTE DE POSGRADO");
        System.out.println("=================================");

        // Llama al método heredado.
        super.mostrarInformacion();

        // Muestra la línea de investigación.
        System.out.println("Línea de investigación: " + lineaInvestigacion);

    }

    // Método propio.
    public void publicarArticulo() {

        System.out.println("Artículo científico publicado.");

    }

}

//============================================================
// CLASE PRINCIPAL
//============================================================

// Únicamente Main debe ser pública.
public class Main {

    // Punto de entrada del programa.
    public static void main(String[] args) {

        // Crea un objeto de tipo EstudianteLicenciatura.
        EstudianteLicenciatura estudiante1 =
                new EstudianteLicenciatura(
                        "Juan Pérez",
                        20,
                        "A001",
                        90.5,
                        "Ingeniería en Software");

        // Crea un objeto de tipo EstudiantePosgrado.
        EstudiantePosgrado estudiante2 =
                new EstudiantePosgrado(
                        "María López",
                        25,
                        "P002",
                        95.0,
                        "Inteligencia Artificial");

        // Muestra la información del primer estudiante.
        estudiante1.mostrarInformacion();

        // Verifica si aprobó.
        estudiante1.verificarAprobacion();

        // Ejecuta el método exclusivo.
        estudiante1.realizarServicioSocial();

        // Línea en blanco.
        System.out.println();

        // Muestra la información del segundo estudiante.
        estudiante2.mostrarInformacion();

        // Verifica si aprobó.
        estudiante2.verificarAprobacion();

        // Ejecuta el método exclusivo.
        estudiante2.publicarArticulo();

    }

}

/*
 * ==========================================================
 * CONTROL DE VERSIONES CON GIT Y GITHUB
 * ==========================================================
 *
 * Para cumplir con los requisitos de la actividad se utilizó
 * Git como sistema de control de versiones y GitHub como
 * repositorio remoto.
 *
 * Pasos realizados:
 *
 * 1. Crear el repositorio local.
 *      git init
 *
 * 2. Agregar todos los archivos del proyecto.
 *      git add .
 *
 * 3. Realizar el primer commit.
 *      git commit -m "Proyecto base Sistema de Gestión de Estudiantes"
 *
 * 4. Crear una nueva rama para implementar la herencia.
 *      git checkout -b actividad3-herencia
 *
 * 5. Agregar las modificaciones.
 *      git add .
 *
 * 6. Guardar los cambios.
 *      git commit -m "Implementación de herencia en el sistema"
 *
 * 7. Subir la nueva rama a GitHub.
 *      git push -u origin actividad3-herencia
 *
 * Con este procedimiento se mantiene un historial organizado
 * de cambios y se conserva la rama principal sin modificar.
 *
 * ==========================================================
 */

