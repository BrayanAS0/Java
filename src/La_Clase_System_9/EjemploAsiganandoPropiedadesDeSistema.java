package La_Clase_System_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsiganandoPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream archivo=  new FileInputStream("scr/La_Clase_System_9/config.properties");
            Properties p = new Properties();
            p.load(archivo);
            p.setProperty("mi.propiedad.privada", "se guardo correctooo");
            System.setProperties(p);
        } catch (Exception e) {
            System.out.println("EL archivo no abre"+e);
        }
    }
}
