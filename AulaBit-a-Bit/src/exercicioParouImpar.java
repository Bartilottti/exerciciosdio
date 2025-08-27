import java.util.Scanner;

public class exercicioParouImpar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);


        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ele tem que ser Maior que o primeiro número");
        int num2 = scanner.nextInt();

        boolean verificar = num2 > num1;
        if(verificar){
            System.out.println("O Segundo Número deve ser Maior que o primeiro");
            return;
        }

        System.out.println("Escolha as opções:\n");
        System.out.println("1 -> Par\n");
        System.out.println("2 -> Impar\n");
        System.out.println("3 -> Sair\n");
        int opcao = scanner.nextInt();



        for (int i = num2; i > num1 ; i--) {
            switch (opcao) {
                case 1: if(i % 2 == 0){
                    System.out.println(i);

                } break;
                case 2: if(i % 2 != 0){
                    System.out.println(i);

                } break;
                case 3:
                    System.out.println("Saindo");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
