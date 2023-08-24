package Tareas;

import java.util.Scanner;

public class Operadores_1_comparar {
    public static void main(String[] args) {
        Integer ciclos;
        System.out.println("Cuantos numeros vas a checar: ");
        Scanner s= new Scanner(System.in);
        ciclos= s.nextInt();
        int numeros[] = new int[ciclos];
        for(int i=0; i<ciclos;i++){
            System.out.println("Ingrese el numero "+(i+1)+" a comparar");
            numeros[i]=s.nextInt();
            if(numeros[i]<10){
                System.out.println("Numero "+numeros[i]+" es menor que 10");
            }
            else {
                System.out.println("Numero "+numeros[i]+" es mayor que 10");
            }
        }
    }
}
