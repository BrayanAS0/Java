package Operadores_Aritmeticos;

public class Bucles_Etiquetas {
    public static void main(String[] args) {
        bucle1:
        for (int i = 1; i <= 5; i++) {

            System.out.println();
            if (i == 2) {
                continue bucle1;//lo importante
            }
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);

            }
        }
    }
}
