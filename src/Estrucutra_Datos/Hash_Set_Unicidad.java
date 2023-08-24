package Estrucutra_Datos;

import java.util.*;

public class Hash_Set_Unicidad {
    public static void main(String[] args) {
        List<Alumno>sa= new ArrayList<>();
      //  Set<Tree_Set_Comparable> sa = new HashSet<>();
        sa.add(new Alumno("c",6));
        sa.add(new Alumno("b",3));
        sa.add(new Alumno("z",2));
        sa.add(new Alumno("d",5));
        sa.add(new Alumno("a",5));
        sa.add(new Alumno("a",8));
        sa.add(new Alumno("z",2));

        System.out.println(sa);

        System.out.println("Interando usando un foreach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }
    }


}
