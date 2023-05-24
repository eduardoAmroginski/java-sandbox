package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ManipularDatas {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance(); /*Pega a data atual*/

        /*Simular que data vem do banco de dados*/
        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("24-05-2023")); /*Definindo uma data qualquer*/

        calendar.add(Calendar.DAY_OF_MONTH, 40); /*Adicionado 5 aos dias do mes da data setada*/
        System.out.println("Somando dia do mes" + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));


        calendar.add(Calendar.MONTH, 1); /*Adicionado 1 aos mes da data setada*/
        System.out.println("Somando o mes: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

        calendar.add(Calendar.YEAR, 1); /*Adicionado 1 aos mes da data setada*/
        System.out.println("Somando o ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

    }
}
