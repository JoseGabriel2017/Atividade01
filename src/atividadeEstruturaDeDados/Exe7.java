package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe7 {
    public static void main(String[] args) {
        double a = 12.25, h;

        Scanner hor = new Scanner(System.in);

        System.out.println("Quantas horas o porteiro trabalhou?");
        h = hor.nextDouble();

        if (a * h < 50.00) {
            System.out.println("Atenção, dirija-se à direção do Hotel!");
        } else {
            System.out.println("O total a ser pago é: " + a * h);
        }

    }
}