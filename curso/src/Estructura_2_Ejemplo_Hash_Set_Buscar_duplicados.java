import java.util.HashSet;
import java.util.Set;

public class Estructura_2_Ejemplo_Hash_Set_Buscar_duplicados {
    public static void main(String[] args) {
        String[] personas={"brayan","Arias","sanchez","Sofia","brayan","sofia","1","2","3"};
        Set<String> unicos= new HashSet<>();

        for (int i = 0; i < personas.length; i++) {
           if(unicos.add(personas[i])){

            }else{
                System.out.println("ELEMENTO DUPLICACO ES : "+personas[i]);            }
            System.out.println(unicos);
            System.out.println("d");

        }

    }
}
