import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a sua renda: ");
        double renda = scanner.nextDouble();

        if (idade < 0 || renda < 0) {
            System.out.println("Dados invalidos");
        } else if (idade >= 18 && renda <= 2000) {
            System.out.println("Voce pode receber o beneficio");
        } else {
            System.out.println("Voce nao pode receber o beneficio");
        }
    }
}