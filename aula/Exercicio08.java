import java.util.Scanner;
public class Exercicio08 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escreva 10 numeros: ");
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }
        int valor = ler.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            valor *= vetor[i];
        }

        System.out.println("Seu vetor ficou desta forma: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("Aqui esta seu produto do vetor: " + valor);

    }
}
