package Operadores_Aritmeticos;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"as", "Brayan", "Arias", "Sanchez"};
        for (String nombre :
                nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}
