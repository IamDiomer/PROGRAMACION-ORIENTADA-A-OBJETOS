package Asociacion;

public class Curso {
    private int id;
    private String nombre;
    private int credito;

    public Curso(int id, String nombre, int credito) {
        this.id = id;
        this.nombre = nombre;
        this.credito = credito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

}
