import java.util.Scanner;

public class exercicioTabela {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s + %s = %s\n" , num , i , num + i);
        }
    }
}
