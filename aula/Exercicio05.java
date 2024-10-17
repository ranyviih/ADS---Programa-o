import java.util.Scanner;

public class Exercicio05 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vetorW = new int[10];
        for (int i = 0; i < vetorW.length; i++) {
            vetorW[i] = ler.nextInt(10);
        }
        int V = ler.nextInt();
        int contador = 0;
         
        for (int i = 0; i < vetorW.length; i++) {
            if (vetorW[i] == V) {
                contador++;
            }
            if (vetorW[i] == V) {
                System.out.println("Posição do valor: " + i);
            } 
        }
        

        System.out.println("O valor repetiu: " + contador + " vezes");
        System.out.println("Seu vetor ficou dessa forma: ");
        for (int i = 0; i < vetorW.length; i++) {
            System.out.println(vetorW[i]);
        }

    }
}
