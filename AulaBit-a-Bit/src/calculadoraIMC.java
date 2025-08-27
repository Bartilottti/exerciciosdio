import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        var ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.next();

        System.out.println("Digite sua altura:");
        var altura = ler.nextDouble();

        System.out.println("Digite sua peso:");
        var peso = ler.nextDouble();

        var IMC = peso/(altura*altura);
        if (IMC<18.5) {
            System.out.printf("%s Você está abaixo do peso" , nome);
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.printf("%s Você está no peso ideal" , nome);
        } else if (IMC>=25 && IMC<=29.9) {
            System.out.printf("%s Você está levemente acima da peso" , nome);
        } else if (IMC>=30 && IMC<=34.9) {
            System.out.printf("%s Você está Obesidade Grau I" , nome);
        }  else if (IMC>=35 && IMC<=39.9) {
            System.out.printf("%s Você está Obesidade Grau II(Severa)" , nome);
        }  else {
            System.out.printf("%s Procure um Médico imediatamente!" ,  nome);
        }
    }
}
