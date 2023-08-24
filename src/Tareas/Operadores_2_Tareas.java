package Tareas;

import java.util.Scanner;

public class Operadores_2_Tareas {
    public static void main(String[] args) {
        String cal[] = new String[2];
        double valor;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < cal.length; i++) {
            System.out.println("Calificacion del alumno " + i);
            valor = s.nextDouble();
            if (valor >= 5) {
                cal[i] = "Nota mayor a 5 del alumno " + i;
            }
            if (valor == 0) {
                System.out.println("Nota que ingreso es 0 ");
                break;
            }
            if (valor < 4 && valor > 1) {
                cal[i] = "Nota mayor que uno y inferior a 4, del alumno " + i;

            }
            if (valor == 1) {
                cal[i] = "Nota que obtuvo el alumno " + i + " es 1";

            }

        }
        for (int j =0 ; j < cal.length; j++) {

            System.out.println(cal[j]);
        }

    }
}
