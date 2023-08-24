package valor_referencia;

public class arreglos_consejo {
    public static void main(String[] args) {
        int[] numeros={1,3,5,7};
        for (int i=0; i<numeros.length;i++)
         {
             System.out.println("numero = " + numeros[i]);

        }
test(numeros);
        System.out.println("Despues del test");
        for (int i=0; i<numeros.length;i++)
        {
            System.out.println("numero = " + numeros[i]);

        }

    }

    public static  void test(int[] arrreglo){
for (int i =0;i< arrreglo.length;i++){
 arrreglo[i]=(arrreglo[i]+10);
}
    }
}
