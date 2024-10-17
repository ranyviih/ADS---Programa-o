import java.util.Scanner;
public class Exercicio01 {
    final static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[6];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = ler.nextInt();
        }

        System.out.println(" Seu vetor é: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                contador++;
            }
        }
        System.out.println("Tem " + contador + " numeros negativos");

    }
}
