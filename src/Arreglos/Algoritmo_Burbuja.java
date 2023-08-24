package Arreglos;
import  java.util.*;
public class Algoritmo_Burbuja {
    public static void main(String[] args) {
        String NOmbres[]= new String[4];
        NOmbres[0]="BRAYAN";
        NOmbres[1]="LAPIZ";
        NOmbres[2]="COLOR";
        NOmbres[3]="AAA";
        for (int i = 0; i < NOmbres.length ; i++) {
            for (int j = 0; j < NOmbres.length; j++) {

if ( NOmbres[i].compareTo(NOmbres[j] )<0){
String auxiliar=NOmbres[i];
NOmbres[i] = NOmbres[j];
NOmbres[j]=auxiliar;
}

            }

        }
        for (int i = 0; i < NOmbres.length; i++) {
            System.out.println("numeros[i] = " + NOmbres[i]);
        }
    }
}
