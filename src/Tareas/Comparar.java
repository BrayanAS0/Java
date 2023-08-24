package Tareas;

import java.util.Scanner;

public class Comparar {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n1,n2;
        System.out.print("n1= ");
        n1=s.nextInt();
        System.out.print("n2= ");
        n2=s.nextInt();
        int max = (n1>n2)? n1:n2;
        int min = (n1<n2)? n1:n2;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
