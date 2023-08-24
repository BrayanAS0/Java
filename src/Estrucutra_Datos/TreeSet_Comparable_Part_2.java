package Estrucutra_Datos;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_Comparable_Part_2 {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        sa.add(new Alumno("cato",6));
        sa.add(new Alumno("buci",3));
        sa.add(new Alumno("zeus",2));
        sa.add(new Alumno("duan",5));
        sa.add(new Alumno("aucas",5));
        System.out.println(sa.toString());
        System.out.println(sa);

    }


}
