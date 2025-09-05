import java.util.Scanner;

public class CalculadoraBasica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA BÁSICA ===");
        System.out.println("Operações disponíveis:");
        System.out.println("+ : Adição");
        System.out.println("- : Subtração");
        System.out.println("x : Multiplicação");
        System.out.println("/ : Divisão");
        System.out.println("s : Sair");
        System.out.println("==========================");
        
        boolean executando = true;
        
        while (executando) {
            System.out.print("\nDigite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Digite a operação (+, -, x, /, s): ");
            String operacao = scanner.next();
            
            // Verificar se o usuário quer sair
            if (operacao.equalsIgnoreCase("s")) {
                executando = false;
                System.out.println("Calculadora encerrada. Até logo!");
                continue;
            }
            
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            boolean operacaoValida = true;
            
            // Realizar a operação selecionada
            switch (operacao) {
                case "+":
                    resultado = somar(num1, num2);
                    break;
                case "-":
                    resultado = subtrair(num1, num2);
                    break;
                case "x":
                    resultado = multiplicar(num1, num2);
                    break;
                case "/":
                    if (num2 != 0) {
                        resultado = dividir(num1, num2);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    operacaoValida = false;
                    break;
            }
            
            // Exibir resultado se a operação foi válida
            if (operacaoValida) {
                System.out.println("Resultado: " + num1 + " " + operacao + " " + num2 + " = " + resultado);
            }
        }
        
        scanner.close();
    }
    
    // Métodos para as operações matemáticas
    public static double somar(double a, double b) {
        return a + b;
    }
    
    public static double subtrair(double a, double b) {
        return a - b;
    }
    
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    public static double dividir(double a, double b) {
        return a / b;
    }
}