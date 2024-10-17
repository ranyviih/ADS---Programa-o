import java.util.Scanner;

public class Exercicio04 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorC = new int[10];

        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = ler.nextInt(10);
        }

        for (int i = 0; i < vetorC.length; i++) {
            if (vetorC[i] < 0) {
                vetorC[i] = 0;
            } 
        }

        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }

    }
}
