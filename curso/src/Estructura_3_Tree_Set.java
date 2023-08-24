import javax.swing.*;
import java.util.Set;
import java.util.TreeSet;

public class Estructura_3_Tree_Set {
    public static void main(String[] args) {

        Set<String> ts =new TreeSet<>();

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("seis");
      //  JOptionPane.showMessageDialog(null, ts);
   Set <Integer> numeros= new TreeSet<>((a,b)->  {
       return b.compareTo(a);
        }
        );
   numeros.add(1);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        JOptionPane.showMessageDialog(null, numeros);

    }
}
