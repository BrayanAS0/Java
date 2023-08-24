package Tareas;

import java.util.Scanner;

public class AREA_Circulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Valor del radio");
        double radio= s.nextDouble();
        System.out.println("Area = " + (Math.PI*Math.pow(radio, 2)));
    }
}
