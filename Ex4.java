import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        
        double perimetro,area,volume;
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número como o indicador de operação: ");
        double operador = s.nextDouble();
        System.out.print("Digite o raio de um circulo ou esfera: ");
        double raio = s.nextDouble();

        perimetro = 2 * Math.PI * raio;
        area = 3.14 * Math.pow(raio,2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O perímetro do circulo: %.2f " , perimetro);
        System.out.printf("\nA areá do circulo: %.2f" , area);
        System.out.printf("\nO volume da esfera: %.2f" , volume);
        
        if (operador != perimetro && operador != area && operador != volume ) {
            
            System.out.println("\nErro, informando que o código da operação é inválido.");

        }

    }
}
