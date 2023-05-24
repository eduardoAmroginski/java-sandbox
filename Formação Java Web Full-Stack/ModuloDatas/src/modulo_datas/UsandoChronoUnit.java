package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class UsandoChronoUnit {
    public static void main(String[] args) throws ParseException {

        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias de uma data até hoje*/
        long meses = ChronoUnit.MONTHS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias de uma data até hoje*/
        long semanas = ChronoUnit.WEEKS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias de uma data até hoje*/
        long anos = ChronoUnit.YEARS.between(LocalDate.parse("2021-02-01"), LocalDate.now()); /*Total de dias de uma data até hoje*/

        System.out.println("Possui " + dias + " dias entre as faixas de data");
        System.out.println("Possui " + meses + " meses entre as faixas de data");
        System.out.println("Possui " + semanas + " semanas entre as faixas de data");
        System.out.println("Possui " + anos + " anos entre as faixas de data");


    }


}
