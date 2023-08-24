package La_Clase_System_9;

public class Ejemplo_Propiedades {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
String Home =System.getProperty("user.home");
        System.out.println("Home = " + Home);
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
String java =System.getProperty("java.version");
        System.out.println("java = " + java);
    }
}
