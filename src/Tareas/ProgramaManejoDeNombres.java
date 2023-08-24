package Tareas;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nombres[]= new String[3];
        for (int i=0;i<3;i++){
            System.out.println("Escribe el nombre de la persona : "+(i+1));
            nombres[i]=s.nextLine();
         nombres[i]=  nombres[i].substring(1,2).toUpperCase()+"."+nombres[i].substring(nombres[i].length()-2);
        }
        for (int j=0;j<3;j++){
            System.out.println(nombres[j]);
        }
    }
}
