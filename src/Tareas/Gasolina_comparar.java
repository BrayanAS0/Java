package Tareas;

import java.util.Scanner;

public class Gasolina_comparar {
    public static void main(String[] args) {

 /*Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque 

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente
*/
        Scanner s= new Scanner(System.in);
        double gasolina;
        String resultado="";
        System.out.println("gasolina  actual es= ");
        gasolina=s.nextDouble();
     if(gasolina>= 70){    resultado= "Estanque lleno";}
        if (gasolina<70 && gasolina>=60){resultado="Estanque casi lleno";}
        if (gasolina>=40 && gasolina<60){resultado="Estanque  3/4";}
        if (gasolina>=35 && gasolina<40){resultado=" Medio Estanque";}
        if (gasolina>=20 && gasolina<35){resultado="Suficiente";}
        if (gasolina>=1 && gasolina<20){resultado="Insuficiente";}
        System.out.println("resultado = " + resultado);
    }
}
