import java.util.Scanner;

public class Exercicio07 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = new int[15];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ler.nextInt(10);
        }
        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[i] < vet[j]) {
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        
        

    }
}
