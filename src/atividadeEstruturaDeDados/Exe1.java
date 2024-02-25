package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {

        int n, a = 0;
        Scanner num = new Scanner(System.in);

        System.out.println("Insira o valor para a tabuada: ");
        n = num.nextInt();

        while (a < 11) {

            System.out.println(n + "*" + a + "=" + a * n);
            a++;
        }
    }
}
