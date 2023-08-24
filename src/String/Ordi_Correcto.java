package String;

import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Ordi_Correcto extends JFrame implements ActionListener {

    //
    final static int TAM_REG = 124;
// para el cof¿digo de calculo


    static int n1 = (int) (Math.random() * 100), n2 = (int) (Math.random() * 100), n3 = (int) (Math.random() * 100), n4 = (int) (Math.random() * 100), n5 = (int) (Math.random() * 100), n6 = (int) (Math.random() * 100), n7 = (int) (Math.random() * 100), n8 = (int) (Math.random() * 100), n9 = (int) (Math.random() * 100), n10 = (int) (Math.random() * 100);
    static int d1 = -1, d2 = -1, d3 = -1, d4 = -1, d5 = -1, r1 = 0, r2 = 0, r3 = 0, r4 = 0, r5 = 0;
    static String q1 = "", q2 = "", q3 = "", q4 = "", q5 = "";

    //
    JButton bt1 = new JButton("Verificar respuestas");
    JTextField a1 = new JTextField(15);
    JTextField a2 = new JTextField(15);
    JTextField a3 = new JTextField(15);
    JTextField a4 = new JTextField(15);
    JTextField a5 = new JTextField(15);
    //
    JTextArea cal = new JTextArea();

    //Menu 
    JLabel mat = new JLabel("Insertar Matricula: ");
    JLabel nom = new JLabel("Insertar Nombre: ");
    JLabel gra = new JLabel("Insertar Grado: ");
    JLabel mate = new JLabel("Insertar Materia: ");
    static JTextField mat1 = new JTextField(15);
    static JTextField nom1 = new JTextField(15);
    static JTextField gra1 = new JTextField(15);
    static JTextField mate1 = new JTextField(15);
    JButton enviar = new JButton("Enviar");

    //
    static int suma = 0, convertir = 0;
    //
    static String na;

    public Ordi_Correcto(String q1, String q2, String q3, String q4, String q5, int r1, int r2, int r3, int r4, int r5, String nombrex, String gra, String mat, String mate) {
        super("Examen");
        Container p;
        p = this.getContentPane();
        setLayout(new FlowLayout());
        //
        JLabel t1 = new JLabel(q1 + " = ");
        JLabel t2 = new JLabel(q2 + " =");
        JLabel t3 = new JLabel(q3 + " =");;
        JLabel t4 = new JLabel(q4 + " =");;
        JLabel t5 = new JLabel(q5 + " =");;

        //
        //
        JPanel p1 = new JPanel();

        p1.setLayout(new FlowLayout());

        p1.add(t1);
        p1.add(a1);

        //
        JPanel p2 = new JPanel();

        p2.setLayout(new FlowLayout());

        p2.add(t2);

        p2.add(a2);
        p2.add(t3);

        p2.add(a3);
        p2.add(t4);

        p2.add(a4);
        p2.add(t5);

        p2.add(a5);
        p2.add(bt1);
        p2.add(cal);
        //
        //se ajusta el ancho de la ventana 
//        p.add(p1);
        p.add(p1);
        p.add(p2);

        bt1.addActionListener(this);

        setSize(8000, 5000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bt1) {
            convertir = Integer.parseInt(a1.getText());
            if (convertir == r1) {
                suma++;
            }
            convertir = Integer.parseInt(a2.getText());
            if (convertir == r2) {
                suma++;
            }
            convertir = Integer.parseInt(a3.getText());
            if (convertir == r3) {
                suma++;
            }
            convertir = Integer.parseInt(a4.getText());
            if (convertir == r4) {
                suma++;
            }
            convertir = Integer.parseInt(a5.getText());
            if (convertir == r5) {
                suma++;

            }

            cal.append("La calificacion es "+suma+"/5");

            try {
                anexar(nom1.getText(), gra1.getText(), mat1.getText(), mate1.getText(), suma);
            } catch (IOException ex) {
                Logger.getLogger(Ordi_Correcto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (e.getSource() == enviar) {
            na = nom1.getText();
            r(nom1.getText(), gra1.getText(), mat1.getText(), mate1.getText());
        }

        //ya al final para que envie los datos
    }

    public static void r(String nombrex, String gra, String mat, String mate) {

        while (d1 >= 5 || d1 <= 0) {
            if (d1 >= 5 || d1 <= 0) {
                d1 = ((int) (Math.random() * 10));

            }
            if (d1 == 1) {
                q1 = "" + (n1 + " + " + n2);
                r1 = n1 + n2;
            }
            if (d1 == 2) {
                q1 = "" + (n1 + " - " + n2);
                r1 = n1 - n2;
            }
            if (d1 == 3) {
                q1 = "" + (n1 + " X " + n2);
                r1 = n1 * n2;
            }
            if (d1 == 4) {
                q1 = "" + (n1 + " / " + n2);
                r1 = n1 / n2;
            }

        }
        //
        while (d2 >= 5 || d2 <= 0) {
            if (d2 >= 5 || d2 <= 0) {
                d2 = ((int) (Math.random() * 10));

            }
            if (d2 == 1) {
                q2 = "" + (n3 + " + " + n4);
                r2 = n3 + n4;
            }
            if (d2 == 2) {
                q2 = "" + (n3 + " - " + n4);
                r2 = n3 - n4;
            }
            if (d2 == 3) {
                q2 = "" + (n3 + " X " + n4);
                r2 = n3 * n4;
            }
            if (d2 == 4) {
                q2 = "" + (n3 + " / " + n4);
                r1 = n3 / n4;
            }
//3

        }
        while (d3 >= 5 || d3 <= 0) {
            if (d3 >= 5 || d3 <= 0) {
                d3 = ((int) (Math.random() * 10));

            }
            if (d3 == 1) {
                q3 = "" + (n5 + " + " + n6);
                r3 = n5 + n6;
            }
            if (d3 == 2) {
                q3 = "" + (n5 + " - " + n6);
                r3 = n5 - n6;
            }
            if (d3 == 3) {
                q3 = "" + (n5 + " X " + n6);
                r3 = n5 * n6;
            }
            if (d3 == 4) {
                q3 = "" + (n5 + " / " + n6);
                r3 = n5 / n6;
            }
//4
        }
        while (d4 >= 5 || d4 <= 0) {
            if (d4 >= 5 || d4 <= 0) {
                d4 = ((int) (Math.random() * 10));

            }
            if (d4 == 1) {
                q4 = "" + (n7 + " + " + n8);
                r4 = n7 + n8;
            }
            if (d4 == 2) {
                q4 = "" + (n7 + " - " + n8);
                r4 = n7 - n8;
            }
            if (d4 == 3) {
                q4 = "" + (n7 + " X " + n8);
                r4 = n7 * n8;
            }
            if (d4 == 4) {
                q4 = "" + (n7 + " / " + n8);
                r4 = n7 / n8;
            }

        }
        while (d5 >= 5 || d5 <= 0) {
            if (d5 >= 5 || d5 <= 0) {
                d5 = ((int) (Math.random() * 10));

            }
            if (d5 == 1) {
                q5 = "" + (n9 + " + " + n10);
                r5 = n9 + n10;
            }
            if (d5 == 2) {
                q5 = "" + (n9 + " - " + n10);
                r5 = n9 - n10;
            }
            if (d5 == 3) {
                q5 = "" + (n9 + " X " + n10);
                r5 = n9 * n10;
            }
            if (d5 == 4) {
                q5 = "" + (n9 + " / " + n10);
                r5 = n9 / n10;
            }

        }

        Ordi_Correcto c = new Ordi_Correcto(q1, q2, q3, q4, q5, r1, r2, r3, r4, r5, nombrex, gra, mat, mate);

    }

    public Ordi_Correcto() {
        super("Examen");
        Container p;
        p = this.getContentPane();
        setLayout(new FlowLayout());
        //

        p.add(mat);
        p.add(mat1);

        p.add(nom);
        p.add(nom1);
        p.add(gra);
        p.add(gra1);
        p.add(mate);
        p.add(mate1);
        p.add(enviar);

        enviar.addActionListener(this);
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void menu() {
        Ordi_Correcto o = new Ordi_Correcto();
    }

    public static void CrearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("se ha creado el archvio");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexar(String nombre, String gra, String mat, String mate, int suma) throws IOException {
        String nombreArchivo = "Examen.txt";
        File archivo = new File(nombreArchivo);
        System.out.println("entro al arhcivo");
        int matricula = Integer.parseInt(mat);

//        try {
//            RandomAccessFile rf = new RandomAccessFile("Examen.txt", "rw");
//            rf.seek(TAM_REG * matricula);
//            rf.writeUTF(mat);
//            rf.writeUTF(nombre);
//            rf.writeUTF(gra);
//            rf.writeUTF(mate);
//            rf.writeInt(suma);
//            rf.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("El archivo no se puede abrir");
//        } catch (IOException e) {
//            System.out.println("El archivo no se puede abrir");
//        }
        
        /////para solo escribir
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));

            RandomAccessFile rf = new RandomAccessFile("Examen.txt", "rw");
            salida.println("Matricula: "+mat);

            salida.println("Nombre: "+nombre);
            salida.println("Materia: "+mate);
            salida.println("Grado: "+gra);
            salida.println("Calificacion: "+suma);
            salida.close();
            System.out.println("se ha anexado escrito");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

//PARA LEER EL ARCHIVO
//        leer(nombreArchivo, matricula); 
    }

    //
    public static void leer(String nombre, int matricula) {
        File archivo = new File(nombre);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var leer = entrada.readLine();
            while (leer != null) {
                System.out.println(leer);
                leer = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }


///////////// para leer

//        try {
//            RandomAccessFile rf = new RandomAccessFile("Examen.txt", "rw");
//            rf.seek(TAM_REG * matricula);
//            System.out.println("Matricula: " + rf.readUTF());
//            System.out.println("Nombre: " + rf.readUTF());
//            System.out.println("Grado: " + rf.readUTF());
//            System.out.println("Materia: " + rf.readUTF());
//            System.out.println("Calificacioes "+rf.readInt() + "/5");
//        } catch (IOException e) {
//            System.out.println("Cuenta no encontrada");
//        }

        
        
        /////////
    }

    public static void main(String[] args) {
        String nombreArchivo = "Examen.txt";//nombre del archivo
CrearArchivo(nombreArchivo);

menu();
//leer(nombreArchivo,12);
    }

}
