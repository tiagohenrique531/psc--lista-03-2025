import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;
        float troco;
        System.out.println("|----------------------------|");
        System.out.println("| O sistema so aceita notas: |");
        System.out.println("| Notas:                     |");
        System.out.println("| 50.00 R$                   |");
        System.out.println("| 20.00 R$                   |");
        System.out.println("| 10.00 R$                   |");
        System.out.println("| 5.00 R$                    |");
        System.out.println("| 2.00 R$                    |");
        System.out.println("| 1.00 R$                    |");
        System.out.println("|----------------------------|");
        System.out.print("Informe o valor da compra: ");
        float compra = s.nextFloat();
        System.out.print("\nInforme o valor a ser pago: ");
        float valor = s.nextFloat();
        boolean test = false;
        
        while (test == false) {
            
        if (valor < compra) {
            System.out.println("\n--------------------------------------------------------------------");
            System.out.println("Informando que a quantia paga é insuficiente para realizar a compra.");
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Informe o valor a ser pago: ");
            float nvalor = s.nextFloat();
            valor = nvalor + valor;
        } else {
            test = true;
        }
        }

        troco = valor - compra;
        float valorTroco = troco;

        while (troco >= 50) {
            troco -= 50;
            nota50++;
        }

        while (troco >= 20) {
            troco -= 20;
            nota20++;
        }

        while (troco >= 10) {
            troco -= 10;
            nota10++;
        }
        
        while (troco >= 10) {
            troco -= 10;
            nota10++;
        }
        
        while (troco >= 5) {
            troco -= 5;
            nota5++;
        }

        while (troco >= 2) {
            troco -= 2;
            nota2++;
        }

        while (troco >= 1) {
            troco -= 1;
            nota1++;
        }
        System.out.printf("\n\nValor pago R$ %#.2f" , valor);
        System.out.printf("\nValor da compra R$ %#.2f" , compra);
        System.out.printf("\nTroco: R$ %#.2f" , valorTroco);
        System.out.println("\n-----------------------");
        System.out.println("Notas R$ 50.00: " + nota50);
        System.out.println("Notas R$ 20.00: " + nota20);
        System.out.println("Notas R$ 10.00: " + nota10);
        System.out.println("Notas R$ 5.00: " + nota5);
        System.out.println("Notas R$ 2.00: " + nota2);
        System.out.println("Notas R$ 1.00: " + nota1);
        System.out.println("--------------------------");
        s.close();
    }   
}
