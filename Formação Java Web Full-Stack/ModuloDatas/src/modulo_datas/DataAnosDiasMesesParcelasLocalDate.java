package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataAnosDiasMesesParcelasLocalDate {
    public static void main(String[] args) {
        LocalDate dataBase = LocalDate.parse("2019-10-05");

//        System.out.println("Data Original: " + dataBase);
//        System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));
//        System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));
//        System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));
//        System.out.println("Mais 2 meses: " + (dataBase = dataBase.plusMonths(2)));
//        System.out.println("Menos 1 Ano: " + (dataBase = dataBase.minusYears(1)));
//        System.out.println("Menos 20 dias: " + (dataBase = dataBase.minusDays(20)));


        for (int parcela = 1; parcela <= 12; parcela++){
            dataBase = dataBase.plusMonths(1);
            System.out.println("Data de vencimento do boleto: " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " da parcela: " + parcela);
        }


    }
}
