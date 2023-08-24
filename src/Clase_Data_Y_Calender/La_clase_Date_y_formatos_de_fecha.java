package Clase_Data_Y_Calender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class La_clase_Date_y_formatos_de_fecha {
    public static void main(String[] args) {
        Date fecha = new Date();
       System.out.println("fecha = " + fecha);//esto es lo mas importante


        SimpleDateFormat df = new SimpleDateFormat("dd-MMMM-YYYY h");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);
    }
}
