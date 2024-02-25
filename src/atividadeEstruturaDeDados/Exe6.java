package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe6 {
    public static void main(String[] args) {
        double a = 12.25, h;

        Scanner hor = new Scanner(System.in);

        System.out.println("Quantas horas o porteiro trabalhou?");
        h = hor.nextDouble();

        System.out.println(a * h);

    }

}
