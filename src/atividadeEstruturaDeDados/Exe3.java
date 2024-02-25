package atividadeEstruturaDeDados;

public class Exe3 {

    public static void main(String[] args) {

        int a = 0, b = 1, c = 0;

        System.out.println(a + "," + b);
        while (a < 145) {

            System.out.println(a);
            c = a + b;
            a = b;
            b = c;

        }

    }
}
