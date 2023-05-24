package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class Periodos {
    public static void main(String[] args) {
        LocalDate dataAntiga = LocalDate.parse("2019-10-05");
        LocalDate dataNova = LocalDate.parse("2023-05-24");

        System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));
        System.out.println("Data antiga é anterior à data nova? " + dataAntiga.isBefore(dataNova));

        System.out.println("Datas são iguais? " + dataAntiga.isEqual(dataNova));

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("Quantos dias: " + periodo.getDays());
        System.out.println("Quantos meses: " + periodo.getMonths());
        System.out.println("Quantos anos: " + periodo.getYears());

        System.out.println("O periodo é de: " + periodo.getYears() + " ano(s) " + periodo.getMonths() + " mes(es) " + periodo.getDays() + " dia(s)" );
        System.out.println("Somente meses: " + periodo.toTotalMonths());

    }
}
