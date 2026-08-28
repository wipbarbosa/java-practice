import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Você é estudante? (true/false): ");
        boolean estudante = scanner.nextBoolean();

        if (!estudante) {
            System.out.println("Não é estudante");
        } else {
            System.out.println("Você é estudante");
        }
    }
}