package Estrucutra_Datos;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public Alumno() {
    }


    public String toString() {
        return nombre + "  nota = " + nota;
    }


    public void setNota(int nota) {
        this.nota = nota;
    }


    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    public int compareTo(Alumno o) {
        if (this.nombre == null) {
            return 0;
        }
     /*  if (this.nombre == null) {
            return 0;
        }


       if(this.nota== o.nota){
           return 0;
       }
        if( this.nota > o.nota){
            return 1;

        }
        else {
            return -1;
        }

    }

*/ //cualquiera de los 2 funciona
      /*  if (this.nota == null) {
            return 0;
        }
        */
        return this.nombre.compareTo(o.nombre);

    }

}
