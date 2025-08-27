import java.util.Scanner;

public class exercicioDivisão {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int segundo = 0;
        System.out.printf("Digite um numero inicial:");
        int inicial = ler.nextInt();



        while (true) {
            System.out.println("Digite um Segundo Número menor que o inicial:");
            segundo = ler.nextInt();

            if (segundo < inicial) {
                System.out.println("Erro!");
                continue;
            }

            var result = segundo % inicial;

            if(result != 0){
                System.out.println("Resto é Diferente de -> 0 ");
                break;
            }
            System.out.println("Resultado: " + result);

        }
    }
}
