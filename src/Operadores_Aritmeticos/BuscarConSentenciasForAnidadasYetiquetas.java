package Operadores_Aritmeticos;

public class BuscarConSentenciasForAnidadasYetiquetas {
    public static void main(String[] args) {

int cantidad=0;
        String prueba = "Brayan Arias Sanchez";

        for (int i = 0; i < prueba.length(); i++) {
if( prueba.charAt(i) == 'a'){
    cantidad++;
}
        }
        System.out.println("cantidad = " + cantidad);
    }
}
