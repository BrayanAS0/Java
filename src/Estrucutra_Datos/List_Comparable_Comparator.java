package Estrucutra_Datos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_Comparable_Comparator {
    public static void main(String[] args) {
        List<Alumno>sa= new ArrayList<>();
      //  Set<Tree_Set_Comparable> sa = new HashSet<>();
        sa.add(new Alumno("carlos",6));
        sa.add(new Alumno("brayan",3));
        sa.add(new Alumno("zeus",2));
        sa.add(new Alumno("daniela",5));
        sa.add(new Alumno("ana",5));
        sa.add(new Alumno("ana",8));
        sa.add(new Alumno("zeus",2));
        Collections.sort(sa);
        System.out.println(sa);

        System.out.println("Interando usando un foreach");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }
    }


}
