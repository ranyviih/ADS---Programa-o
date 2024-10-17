import java.util.Scanner;

public class Exercicio06 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vet = new int[10];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = ler.nextInt(10);
        }
        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
         int menor = 0;
         int posi = 0;
        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                menor = vet[i];
                posi = i;
            } else if (vet[i] < menor) {
                menor = vet[i];
                posi = i;
            }
        }
        
       System.out.println( "o menor elemento é = " + menor +" e a sua posição é = " + posi );
        

    }
}
