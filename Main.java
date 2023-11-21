import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int number1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int number2 = scan.nextInt();

        System.out.println("1. Para Somar.\n2. Para Subtrair.");
        int option = scan.nextInt();
        if(option == 1) {
            int add = number1 + number2;
            System.out.println("O resultado da soma é: " + add );
        }else if (option == 2) {
            int subtract = number1 - number2;
            System.out.println("O resultado da subtração é: " + subtract );
        }else {
            System.out.println("Selecione uma opção válida!");

        }
        scan.close();
    }
}