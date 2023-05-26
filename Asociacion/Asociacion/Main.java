package Asociacion;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(1, "Base de Datos", 4);
        Curso curso2 = new Curso(2, "Analisis y Diseño de Sistemas", 3);
        Curso curso3 = new Curso(3, "Programación", 5);

        Docente docente1 = new Docente(1, "Jose", "Nuñez Vicente", "Informática");
        Docente docente2 = new Docente(2, "Freddy", "Virgilio Arratea", "Ingeniaria de Sistemas");
        Docente docente3 = new Docente(3, "Ethel", "Manzano Lozano", "Ingenieria de Sistemas");

        CursoDocente cursoDocente = new CursoDocente(1);

        cursoDocente.agregarDocenteCurso(curso1, docente1);
        cursoDocente.agregarDocenteCurso(curso2, docente1);
        cursoDocente.agregarDocenteCurso(curso3, docente2);
        cursoDocente.agregarDocenteCurso(curso3, docente1);


        cursoDocente.listarDocenteCursos();

        cursoDocente.buscarPorId(1);

        Curso nuevoCurso = new Curso(4, "Estructura de Datos", 3);
        Docente nuevoDocente = new Docente(4, "Valentina", "Martinez Valle", "Informatica");
        cursoDocente.editarDocenteCurso(1, nuevoCurso, nuevoDocente);

        cursoDocente.listarDocenteCursos();

       cursoDocente.eliminarDocenteCurso(0);

        cursoDocente.listarDocenteCursos();
    }
}
