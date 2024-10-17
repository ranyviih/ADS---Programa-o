import java.util.Scanner;

public class Exercicio02 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorB = new int[10];

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = ler.nextInt();
        }

        for (int i = 0; i < vetorB.length; i++) {
            if (vetorB[i] % 2 == 0) {
                vetorB[i] = 0;
            } else {
                vetorB[i] = 1;
            }
        }

        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }

    }
}
