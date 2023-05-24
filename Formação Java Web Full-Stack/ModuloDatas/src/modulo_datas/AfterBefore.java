package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AfterBefore {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2023");

        Date dataAtualHoje = simpleDateFormat.parse("11/04/2023");

        /*AFTER: Se a data 1 é maior que a data 2*/
        if (dataVencimentoBoleto.after(dataAtualHoje)){
            System.out.println("Boleto ainda não venceu");
        }else{
            System.out.println("Boleto vencido - URGENTE");
        }

        /*BEFORE: Se a data 1 é menor que a data 2*/
        if (dataVencimentoBoleto.before(dataAtualHoje)){
            System.out.println("Boleto vencido - URGENTE");
        }else{
            System.out.println("Boleto ainda não venceu");
        }
    }

}
