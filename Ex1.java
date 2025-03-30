import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        String[] nome = {"primeiro", "segundo", "terceiro"};
        int[] numero = new int[3];
        int media = 0;
        int maior = 0;
        int menor = 0;

        Scanner s = new Scanner(System.in);
        for(int x = 0;x < 3; x++) {
            System.out.println("Digite o " + nome[x] + " número");
            numero[x] = s.nextInt();

            if(maior == 0){
                maior = numero[x];
            } else if (numero[x] > maior) {
                maior = numero[x];
            }

            if(menor == 0) {
                menor = numero[x];
            } else if (numero[x] < menor) {
                menor = numero[x];
            }

            media = media + numero[x];

        }
        System.out.println("O maior número é : " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.println("A média dos números é: " + media/3);
    }
}
