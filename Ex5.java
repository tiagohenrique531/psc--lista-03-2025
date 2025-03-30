import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int erro = 0;
        double n1,n2,resultado;
        String[] operador1 = new String[2];
        System.out.print("Digite o primeiro número: ");
        n1 = s.nextFloat();
        System.out.print("Diigte o segundo número: ");
        n2 = s.nextFloat();
        System.out.println("Digite o simbolo de operação (+,-,*,/,^)");
        operador1[0] = s.next();
        System.out.println("Digite o simbolo de operação (+,-,*,/,^)");
        operador1[1] = s.next();
        
        for(int i = 0; i < 2; i++){
            switch (operador1[i]) {
                case "+":
                    resultado = n1 + n1;
                    System.out.println(n1 + " + " + n2 + " = " + resultado);
                    break;

                case "-":
                    resultado = n1 - n2;
                    System.out.println(n1 + " - " + n2 + " = " + resultado);
                    break;

                case "*":
                    resultado = n1 * n2;
                    System.out.println(n1 + " * " + n2 + " = " + resultado);
                    break;

                case "/":
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                    break;

                case "^":
                    resultado = Math.pow(n1, n2);
                    System.out.println(n1 + " ^ " + n2 + " = " + resultado);
                    break;

                default:
                    System.out.println("ERRO, informando que o símbolo da operação é inválido.");
                    erro = 1;
                    break;

                
                }
                if (erro == 1) {
                    break;
                }
            }
        }

    }

