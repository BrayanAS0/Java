package Estrucutra_Datos;

import java.util.HashSet;
import java.util.Set;

public class Hast_Set_BuscarDuplicado {
    public static void main(String[] args) {
        String peces[] = {"pez", "Corvina", "Legunado", "Pejerrey", "Legunado", "pez", "pez"};
        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);

            }
        }

        unicos.remove(duplicados);
        System.out.println(unicos.size() + " Elemento  no duplicado " + unicos);
        System.out.println(duplicados.size() + " Elemento   duplicado " + duplicados);
    }
}
