package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerarParcelas {
    public static void main(String[] args) throws ParseException {
        Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("24/05/2023"); /*Data inicial*/

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInicial);

        for (int parcela = 1; parcela <= 12; parcela++){
            calendar.add(Calendar.MONTH, 1);

            System.out.println(String.format("O Vencimento da parcela %s ocorrerá em: %s", parcela, new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime())));
        }

    }
}
