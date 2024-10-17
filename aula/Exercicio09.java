
import java.util.Scanner;

public class Exercicio09 {
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[] vet01 = new String[3];
        
        for (int i = 0; i < vet01.length; i++) {
            vet01[i] = ler.nextLine();
        }
        System.out.println("Seu vetor ficou dessa forma: ");
        for (int j = vet01.length - 1; j >= 0; j--) {
            System.out.println(vet01[j]);
        }

    }
}
