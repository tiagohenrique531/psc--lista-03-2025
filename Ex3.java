import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double a, b, c,eqlgrau;
        double delta = 0,x1 = 0,x2 = 0;
        double sinal;
        Scanner s = new Scanner(System.in);
        System.out.print("Informe um número coeficiente A: ");
        a = s.nextDouble();
        System.out.print("Informe um número coeficiente B: ");
        b = s.nextDouble();
        System.out.print("Informe um número coeficiente C: ");
        c = s.nextDouble();

       

        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");

        } else if(a == 0 && b != 0) {
            eqlgrau = -c/b;
            System.out.println("Essa é uma equação do primeiro grau. ");
            System.out.println("O valor da equação é: x = " + eqlgrau);
        } else {
            delta = (b * b) - (4 * a * c);
            sinal = Math.signum(delta);
            if(sinal == -1.0){
                System.out.println("Essa equação não possui raízes reais");

            } else if(delta == 0) {
                System.out.println("Esta equação possui duas raízes reais iguais.");
                x1 = -b / (2 * a) ;
                System.out.println("O valor da equação é: x1 = " + x1);
            } else if(delta > 0) 
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                x1 = (-b - Math.sqrt(delta)) / (2*a) ;
                x2 = (-b + Math.sqrt(delta)) / (2*a) ;
                System.out.print("O valor da equação é: x1 = ");
                System.out.printf("%.0f",x1);
                System.out.print(" e x2 = " );
                System.out.printf("%.0f",x2);
            
        }

        s.close();
    }
}
