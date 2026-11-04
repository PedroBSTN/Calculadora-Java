import java.util.Scanner;

public class CalculadoraJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CALCULADORA JAVA ===");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            double num1, num2;

            switch (opcao) {
                case 1:
                    System.out.print("Primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Segundo número: ");
                    num2 = scanner.nextDouble();

                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero!");
                    }
                    break;

                case 5:
                    System.out.print("Base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Expoente: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + Math.pow(num1, num2));
                    break;

                case 6:
                    System.out.print("Número: ");
                    num1 = scanner.nextDouble();

                    if (num1 >= 0) {
                        System.out.println("Resultado: " + Math.sqrt(num1));
                    } else {
                        System.out.println("Não existe raiz quadrada real para número negativo.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}