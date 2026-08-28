import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
