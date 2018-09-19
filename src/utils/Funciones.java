package utils;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author JairoDev
 */
public class Funciones {

    public static String getFecha(JDateChooser jd) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        if (jd.getDate() != null) {
            return format.format(jd.getDate());
        } else {
            return null;
        }
    }

    public static java.sql.Date parseaFechaOracle(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date textFieldAsDate = null;

        try {
            textFieldAsDate = sdf.parse(fecha);
        } catch (ParseException pe) {
            // deal with ParseException
        }

        sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = java.sql.Date.valueOf(sdf.format(textFieldAsDate));
        return date;
    }

    public static String obtenerFecha(String fecha) {
        String[] array = fecha.split(" ");
        String fech = array[0];
        return fech;
    }

    public static java.util.Date parsearFechaJava(String fecha) {
        String[] array = fecha.split("-");
        String fech = array[2] + "/" + array[1] + "/" + array[0];
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date textFieldAsDate = null;
        try {
            textFieldAsDate = sdf.parse(fech);
        } catch (ParseException pe) {
            // deal with ParseException
        }
        return textFieldAsDate;
    }

    public static void valCampoTel(java.awt.event.KeyEvent evt, String campo) {
        char car = evt.getKeyChar();
        if (campo.length() >= 8) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }
    public static void valCampoNit(java.awt.event.KeyEvent evt, String campo) {
         char car = evt.getKeyChar();
        if (campo.length() >= 11) {
            evt.consume();
        }
        if ((car < '0' || car > '9')) {
            evt.consume();
        }
    }
}
