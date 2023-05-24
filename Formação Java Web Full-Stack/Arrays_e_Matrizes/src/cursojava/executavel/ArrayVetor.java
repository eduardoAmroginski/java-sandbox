package cursojava.executavel;

public class ArrayVetor {
    public static void main(String[] args) {

        /*Array pode ser de todos os tipos de dados e objetos também*/

        /*Array sempre deve ter a quantidade de posições definidas*/
        double[] notas = new double[4];

        notas[0] = 7.8;
        notas[1] = 8.7;
        notas[2] = 9.7;
        notas[3] = 9.9;

        for (int i = 0; i < notas.length; i++) {
            System.out.println(String.format("notas[%s] = %s", i, notas[i]));
        }

        System.out.println(EncontraValorMaior(notas));
    }


    public static String EncontraValorMaior(double[] notas){
        int currentPos = -1;
        double maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > maxValue){
                maxValue = notas[i];
                currentPos = i;
            }
        }

        return String.format("A maior nota está na posição %s e o valor é %s", currentPos, maxValue);
    }

}