package Operadores_Aritmeticos;

import java.util.Scanner;

public class otraForma_else_if 
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n1,n2,n3,n4;
        System.out.print("n1= ");
        n1=s.nextInt();
        System.out.print("n2= ");
        n2=s.nextInt();
        System.out.print("n3= ");
        n3=s.nextInt();
        System.out.print("n4= ");
        n4=s.nextInt();
        
        int max= (n1>n2)? n1:n2;
        max= (max>n3)? max:n3;
        max= (max>n4)? max: n4;
        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("max = " + max);
    }
}
