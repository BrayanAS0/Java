package Arreglos;

public class OrdenPrincipioFin {
    public static void main(String[] args) {
        int numeros[] = new int[21];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;

        }
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i]);
        }
    }
}
