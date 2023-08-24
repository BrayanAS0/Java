package Clase_Data_Y_Calender;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Convertir_una_fecha_String_a_objeto_del_tipo_Date {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese un formato con yyyy-MM-dd");

        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            Calendar fechaActual= Calendar.getInstance();
            System.out.println("fechaActual.getTime() = " + fechaActual.getTime());
            System.out.println("fechaActual.compareTo(3) = " +fecha.compareTo(fechaActual.getTime()));

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
