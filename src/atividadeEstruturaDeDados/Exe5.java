package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe5 {
    public static void main(String[] args) {
        int a;
        Scanner n = new Scanner(System.in);

        System.out.println("Insira o numero para a analise: ");
        a = n.nextInt();

        if (a % 2 == 1) {
            System.out.println(a + " esse numero e impar!");
        } else {
            System.out.println(a + " esse numero e par!");
        }

        if (a != 1 && a % 5 != 0 && a % 2 != 0) {
            System.out.println(a + " e primo!");
        } else {
            System.out.println(a + " nao e primo!");
        }
    }
}
