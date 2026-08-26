import java.util.Scanner;

public class Ex03 {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int numero2 = scanner.nextInt();

        int adicao = numero1 + numero2;
        int subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.println("Adição: "+ adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
    }
}
