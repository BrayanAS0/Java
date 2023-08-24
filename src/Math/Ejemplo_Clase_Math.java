package Math;

public class Ejemplo_Clase_Math {
    public static void main(String[] args) {
        int prueba= Math.max(12, 123);
        System.out.println("prueba = " + prueba);
       double prueba2= Math.floor(3.45);
        System.out.println("prueba2 = " + prueba2);
        double prueba3= Math.pow(2, 6);
        System.out.println("prueba3 = " + prueba3);
        double prueb_raiz= Math.sqrt(9);
        System.out.println("prueb_raiz = " + prueb_raiz);
        double grados = Math.toDegrees(1.57);
        System.out.println("radianes = " + grados);
        System.out.println(" Radines deondiados= " +Math.round(grados) );
double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " +radianes );
        System.out.println("Sin(90): "+Math.sin(radianes));
        

    }
}
