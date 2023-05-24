package cursojava.executavel;

public class Matriz {

    public static void main(String[] args) {

        int notas[][] = new int[2][3];

        notas[0][0] = 80;
        notas[0][1] = 50;
        notas[0][2] = 90;

        notas[1][0] = 30;
        notas[1][1] = 70;
        notas[1][2] = 10;

        System.out.println("");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Linha: " + i);
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println(String.format("notas[%s][%s] = %s", i,j,notas[i][j]));
            }
        }

    }

}
