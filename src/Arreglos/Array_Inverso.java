package Arreglos;

import java.util.Arrays;

public class Array_Inverso {
    public static void main(String[] args) {
        int numeros[]= new int[4];


        numeros[0]=99;
        numeros[1]=3;
        numeros[2]=44;
        numeros[3]=0;
        Arrays.sort(numeros);


        for (int j = (numeros.length-1); j >=0 ; j--) {
            System.out.println("numeros[j] = " + numeros[j]);
        }
    }
}
