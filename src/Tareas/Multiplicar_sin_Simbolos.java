package Tareas;

import java.util.Scanner;

public class Multiplicar_sin_Simbolos {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1=0,n2=0;
        System.out.println("Numero 1 =");
        n1=s.nextInt();
        System.out.println("Numero 2 = ");
        n2=s.nextInt();
        int valor=0;
        if((n1>0 &&n2>0) || (n1<0 && n2<0)){
        for (int i =1; i<=n2;i++){

          valor= valor+n1;
        }
        }
        if((n1<0 &&n2>0) ){
            for (int i =1; i<=n2;i++) {
                valor +=n1;
            }
        }
        if((n2<0 &&n1>0) ) {
            for (int i = 1; i <= n1; i++) {
                valor += n2;
            }
        }
        System.out.println("valor = " + valor);
    }
}
