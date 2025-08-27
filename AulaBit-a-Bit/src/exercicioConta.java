import java.util.Scanner;

public class exercicioConta {
    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);

        System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");
        System.out.println("    Leia o enunciado: \n");
        System.out.println("    Um Quadrado que sua altura é de 25cm e que sua largura tem 50cm\n");
        System.out.println("    Sabendo da altura e largura , calcule para saber a área de seu quadrado \n");
        System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");

        System.out.println("     Escreva sua resposta:\n");
        int resposta = ler.nextInt();

        var resultado = 25 * 50;

        if (resposta == resultado) {
            System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");
            System.out.printf("         Parabéns você acertou está correto, esse é o resultado: %s\n" , resposta);
            System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");
        } else {
            System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");
            System.out.println("                           Resposta errada!!\n");
            System.out.println("⊱⋅ ──────────────────────────────────────────────────────────────────────── ⋅⊰\n");
        }

        }
    }
