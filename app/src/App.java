import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        if (numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }

        // Exercício 2
        System.out.println("Digite dois números:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int maior = numero1 > numero2 ? numero1 : numero2;
        System.out.println("O maior número é: " + maior);

        // Exercício 3
        System.out.println("Digite dois números distintos:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) {
            System.out.println("A sequência de números informados é inválida.");
        } else if (a > b) {
            System.out.println("O maior número é: " + a);
        } else {
            System.out.println("O maior número é: " + b);
        }

        // Exercício 4
        System.out.println("Digite dois números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        double divisao = (double) num1 / num2;
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        // Exercício 5
        System.out.println("Digite dois números:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Valores originais: A = " + x + ", B = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Valores trocados: A = " + x + ", B = " + y);

        // Exercício 6
        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9 * celsius + 160) / 5;
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        // Exercício 7
        System.out.println("Digite um número:");
        int num = scanner.nextInt();
        if (num >= 100 && num <= 200) {
            System.out.println("O número está no intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

        // Exercício 8
        System.out.println("Digite um número:");
        int n = scanner.nextInt();
        if (n >= 50) {
            System.out.println("O número é maior ou igual a 50.");
        } else {
            System.out.println("O número é menor que 50.");
        }

        // Exercício 9
        System.out.println("Digite dois números:");
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        if (numA == numB) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
            System.out.println("O maior número é: " + (numA > numB ? numA : numB));
        }

        // Exercício 10
        System.out.println("Digite um número de 1 a 5:");
        int numeroExt = scanner.nextInt();
        switch (numeroExt) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número inválido!");
        }

        // Exercício 11
        System.out.println("Digite três números inteiros distintos:");
        int num1A = scanner.nextInt();
        int num2A = scanner.nextInt();
        int num3A = scanner.nextInt();
        if (num1A < num2A && num1A < num3A) {
            System.out.print(num1A + " ");
            if (num2A < num3A) {
                System.out.println(num2A + " " + num3A);
            } else {
                System.out.println(num3A + " " + num2A);
            }
        } else if (num2A < num1A && num2A < num3A) {
            System.out.print(num2A + " ");
            if (num1A < num3A) {
                System.out.println(num1A + " " + num3A);
            } else {
                System.out.println(num3A + " " + num1A);
            }
        } else {
            System.out.print(num3A + " ");
            if (num1A < num2A) {
                System.out.println(num1A + " " + num2A);
            } else {
                System.out.println(num2A + " " + num1A);
            }
        }

        // Exercício 12
        System.out.println("Digite o número do mês:");
        int mes = scanner.nextInt();
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Mês inválido!");
        }

        scanner.close();
    }
}
