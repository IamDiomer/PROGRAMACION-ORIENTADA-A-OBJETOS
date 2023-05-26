package Asociacion;

public class CursoDocente {
    private int id;
    private Curso[] cursos;
    private Docente[] docentes;
    private int cantidad;

    public CursoDocente(int id) {
        this.id = id;
        cursos = new Curso[10]; // Puedes ajustar el tamaño según tus necesidades
        docentes = new Docente[10]; // Puedes ajustar el tamaño según tus necesidades
        cantidad = 0;
    }

    public void agregarDocenteCurso(Curso curso, Docente docente) {
        if (cantidad < cursos.length && cantidad < docentes.length) {
            cursos[cantidad] = curso;
            docentes[cantidad] = docente;
            cantidad++;
        } else {
            System.out.println("No se pueden agregar más docentes y cursos.");
        }
    }

    public void listarDocenteCursos() {
        if (cantidad == 0) {
            System.out.println("No hay docentes y cursos registrados.");
            return;
        }

        System.out.println("Docentes y Cursos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Docente ID: " + docentes[i].getId());
            System.out.println("Nombre: " + docentes[i].getNombres() + " " + docentes[i].getApellidos());
            System.out.println("Carrera: " + docentes[i].getCarrera());
            System.out.println("Curso ID: " + cursos[i].getId());
            System.out.println("Nombre: " + cursos[i].getNombre());
            System.out.println("Crédito: " + cursos[i].getCredito());
            System.out.println("-------------------------");
        }
    }

    public void buscarPorId(int id) {
        boolean encontrado = false;

        for (int i = 0; i < cantidad; i++) {
            if (docentes[i].getId() == id || cursos[i].getId() == id) {
                System.out.println("Docente ID: " + docentes[i].getId());
                System.out.println("Nombre: " + docentes[i].getNombres() + " " + docentes[i].getApellidos());
                System.out.println("Carrera: " + docentes[i].getCarrera());
                System.out.println("Curso ID: " + cursos[i].getId());
                System.out.println("Nombre: " + cursos[i].getNombre());
                System.out.println("Crédito: " + cursos[i].getCredito());
                System.out.println("-------------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron docentes o cursos con el ID especificado.");
        }
    }

    public void editarDocenteCurso(int indice, Curso curso, Docente docente) {
        if (indice >= 0 && indice < cantidad) {
            cursos[indice] = curso;
            docentes[indice] = docente;
            System.out.println("Docente y Curso actualizados exitosamente.");
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }

    public void eliminarDocenteCurso(int indice) {
        if (indice >= 0 && indice < cantidad) {
            for (int i = indice; i < cantidad - 1; i++) {
                cursos[i] = cursos[i + 1];
                docentes[i] = docentes[i + 1];
            }
            cursos[cantidad - 1] = null;
            docentes[cantidad - 1] = null;
            cantidad--;
            System.out.println("Docente y Curso eliminados exitosamente.");
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }
}
