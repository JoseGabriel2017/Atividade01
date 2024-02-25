package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe8 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);

        double cust, preç;

        System.out.println("Insira o valor de custo do produto: ");
        cust = val.nextInt();

        System.out.println("Insira o valor de preço de venda do produto: ");
        preç = val.nextInt();

        if (preç > cust * 1.5) {

            System.out.println("O produto deu lucro!");
        } else {
            System.out.println("O produto deu prejuizo!");
        }
    }

}
