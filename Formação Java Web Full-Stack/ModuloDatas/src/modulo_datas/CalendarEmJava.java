package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEmJava {

    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();

        System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
        System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Hoda do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minutos da Hora: " + calendar.get(Calendar.MINUTE));
        System.out.println("Segundos: " + calendar.get(Calendar.SECOND));
        System.out.println("Ano atual: " + calendar.get(Calendar.YEAR));

        /*---------------------Simple Date Format---------------------*/

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Data atual em formato padrao e String usando Calendar: " + simpleDateFormat.format(calendar.getInstance().getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Data atual em formato para banco de dados usando Calendar: " + simpleDateFormat.format(calendar.getInstance().getTime()));

        System.out.println("Objeto Date: " + simpleDateFormat.parse("1987-10-18 20:10:20"));
    }

}
