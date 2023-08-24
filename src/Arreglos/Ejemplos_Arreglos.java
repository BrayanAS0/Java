package Arreglos;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejemplos_Arreglos {
    public static void main(String[] args) {
        int numeros[]= new int[4];
        String nombres[]= {"Brayan","BBBBBBBBB","brayan","Arias","Sanchez","B","0"};
        Arrays.sort(nombres);
        for (int i =0; i<nombres.length;i++){
            System.out.println("Nombres[" +i+"] "+nombres[i] );
        }
         numeros[0]=99;
        numeros[1]=3;
        numeros[2]=44;
        numeros[3]=0;
        Arrays.sort(numeros);
        for (int num:numeros
             ) {
            System.out.println("num = " + num);
            
        }
        System.out.println("Impresion inversa");
        for (int j = (numeros.length-1); j >=0 ; j--) {
            System.out.println("numeros[j] = " + numeros[j]);
        }

    }
}
