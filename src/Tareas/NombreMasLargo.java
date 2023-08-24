package Tareas;

import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String[] nombres= new String[3];
        nombres[0]=JOptionPane.showInputDialog("nombre de la persona 1");
        nombres[1]=JOptionPane.showInputDialog("nombre de la persona 2");
        nombres[2]=JOptionPane.showInputDialog("nombre de la persona 3");
        String masLargo="";
       if(nombres[0].length()> nombres[1].length()){
            masLargo=nombres[0];
       }
       else {
           masLargo=nombres[1];
       }
        if(nombres[2].length()> nombres[1].length()){
            masLargo=nombres[2];
        }
        JOptionPane.showMessageDialog(null,masLargo);
    }
}
