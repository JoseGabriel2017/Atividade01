package atividadeEstruturaDeDados;

public class Exe4 {

    public static void main(String[] args) {

        int a = 1, b = 0, c = 0, d = 1;

        while (a < 30) {

            if (a % 2 == 1) {
                b = b + a;

            }
            a++;
        }
        System.out.println(b);

        while (d < 30) {

            if (d % 2 == 0) {
                c = c * d;

            }
            d++;
        }
        System.out.println(c);
    }
}
