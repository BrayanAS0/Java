package Arreglos;

public class Burbuja_Ordenado {
    public static  void ObjectBurbujas(Object aareglo[]){

    }
    public static void main(String[] args) {
        String Nombres[]= new String[6];
        Nombres[0]="BRAYAN";
        Nombres[1]="LAPIZ";
        Nombres[2]="COLOR";
        Nombres[3]="AAA";
        Nombres[4]="ZZZZZ";
        Nombres[5]="0000";
        int con=0;
        for (int i = 0; i < Nombres.length; i++) {
            for (int j = 0; j < Nombres.length-1-i; j++) {
                String auxiliar= Nombres[i];
                if ( Nombres[i+1].compareTo(Nombres[j])<0){
Nombres[i]= Nombres[j+1];
Nombres[ j+1 ]= auxiliar;
                }
                con++;
            }
        }
        for (int i = 0; i < Nombres.length ; i++) {
            System.out.println(Nombres[i]);
        }
        System.out.println("con = " + con);


        /*  */
    }
}
