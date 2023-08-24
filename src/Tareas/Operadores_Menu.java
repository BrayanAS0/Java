package Tareas;

import javax.swing.*;

public class Operadores_Menu {
    public static void main(String[] args) {
        int opcion ;
        do{
        opcion=  Integer.parseInt( JOptionPane.showInputDialog("Selecionar una opcion" +
                    "\n1.Actualizar" +
                    "\n2.Eliminar" +
                    "\n3.Agregar" +
                    "\n4.Listar" +
                    "\n5.Salir"));
            if (opcion == 1) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
            }
            if (opcion == 2) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado correctamente");
            }
            if (opcion == 3) {
                JOptionPane.showMessageDialog(null, "Usuario Agregado correctamente");
            }
            if (opcion == 4) {
                JOptionPane.showMessageDialog(null, "Usuario Listado correctamente");
            }


            }while(opcion != 5);
        if (opcion == 5) {
            JOptionPane.showMessageDialog(null, "Usted ha salido con exito");
        }
    }
}
