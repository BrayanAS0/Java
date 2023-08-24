package Clase_Data_Y_Calender;

import java.util.Calendar;
import java.util.Date;

public class La_clase_Calendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();//lo mas importante y util
calendario.set(2020, 11, 31, 4, 50, 5);
        System.out.println("calendario = " + calendario.getTime());

        Date fecha = new Date();
fecha.setYear(2);
fecha.setDate(31);
fecha.setHours(21);
        System.out.println("fecha = " + fecha);
        Calendar  cal = Calendar.getInstance();
        System.out.println("cal.getTime() = " + cal.getTime());
        Date d= new Date();
        System.out.println("d); = " + d);
    }
}
