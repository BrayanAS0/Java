package Operadores_Aritmeticos;

import javax.swing.*;
import java.util.Scanner;

public class segundo_contraseñasYarreglos {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        Scanner c= new Scanner(System.in);
        String[] Username={"Brayan","arias","Sanchez"};
        int[] Passwords={1,2,3};
        String nombre  ;
        int contraseña;
        System.out.print("Nombre= ");
        nombre=s.nextLine();
        System.out.print("Contraseña= ");
        contraseña=c.nextInt();
        Boolean verificar=false;
        for (int i=0;i< Username.length;i++){
verificar = (Username[i].equalsIgnoreCase(nombre) && contraseña==Passwords[i])? true:verificar;
          /*  if(Username[i].equalsIgnoreCase(nombre) && contraseña==Passwords[i]){
                JOptionPane.showMessageDialog(null,"Buenvenido"+Username[i]);
            verificar=true;
                break;
            }

*/
}

        if (verificar) {
            System.out.println("Contraseña y nombre correcto");
        }
            else{
                System.out.println("Contraseña o nombre equivocado");
            }
            }
        }




