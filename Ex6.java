import java.util.Scanner;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int n1,n2, sorteio;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        n1 = s.nextInt();
        System.out.print("\nInforme o segundo núemro: ");
        n2 = s.nextInt();

        Random r = new Random();

        sorteio = r.nextInt(1000);

        System.out.println("Os números digitados é " + n1 + " , " + n2);

        if (n1 > n2) {
            System.out.println("O maior número é " + n1);
            System.out.println("E o menor número é " + n2);
        } else {
            System.out.println("O maior número é  " + n2);
            System.out.println("E o menor número é " + n1);
        }

        if(sorteio % 2 == 0) {
            System.out.println(sorteio + " é par");
        } else {
            System.out.println(sorteio + " é ímpar");
        }

    }
}
