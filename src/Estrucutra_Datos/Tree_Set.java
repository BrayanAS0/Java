package Estrucutra_Datos;

import java.util.*;


public class Tree_Set {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        ts.add("Carlos");
        ts.add("Juan");

        ts.add("Brayan");
        ts.add("Ana");
        ts.add("Pepe");
        ts.add("Zerro");
        System.out.println(ts);


        Set<Integer>numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(8);
        numeros.add(9);
        numeros.add(0);
        numeros.add(1);
        numeros.add(4);
        System.out.println(numeros);
    }
}
