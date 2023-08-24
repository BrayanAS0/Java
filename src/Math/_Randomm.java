package Math;

public class _Randomm {
    public static void main(String[] args) {
        String[] colores={"ROJO","BLANCO","AZUL","NEGRO","VERDE"};
        System.out.println("colores[(int) Math.round(Math.floor(Math.random())* colores.length)] = " + colores[(int) Math.round(Math.floor(Math.random())* colores.length)]);
        double random = Math.random()*10;
        System.out.println("random = " + random);
        System.out.println("random = " +Math.round(random) );
        java.util.Random RA=new java.util.Random();
        int nuevo= RA.nextInt();
        System.out.println("nuevo = " + nuevo);
    }
}
