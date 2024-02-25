package atividadeEstruturaDeDados;

import java.util.Scanner;

public class Exe2 {
    public static void main(String[] args) {

        int a, b, esc;

        Scanner num = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        a = num.nextInt();

        System.out.println("Insira o segundo numero: ");
        b = num.nextInt();

        System.out.println(
                "Selecione qual operação você quer fazer: \n1->Subtracao \n2->Soma \n3->Multiplicacao \n4->Divisao");
        esc = num.nextInt();

        double res = 0;
        switch (esc) {
            case 1:
                res = a - b;
                break;

            case 2:
                res = a - b;
                break;

            case 3:
                res = a - b;
                break;

            case 4:
                res = a - b;
                break;

            default:
                System.out.println("Esse numero não corresponde a nenhuma das operacoes!");
                break;
        }
    }

}
