import java.util.Scanner;
import java.util.Random;

public class Exercicio03 {
    final static Scanner ler = new Scanner(System.in);
    final static Random random = new Random();

    public static void main(String[] args) {
        int[] vetor = new int[100];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(10);
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 5) {
                vetor[i] = 1;
            } 
        }

        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" - " + vetor[i]);
        }

    }
}
