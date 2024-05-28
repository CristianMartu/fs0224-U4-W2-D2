package Es1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> arraySet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        System.out.print("Inserire quantità di stringhe da aggiungere: ");
        try {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > 0) {
                for (int i = 0; i < num; i++) {
                    System.out.print("Inserire parola: ");
                    String world = scanner.nextLine();
                    if (arraySet.contains(world)) {
                        duplicateSet.add(world);
                    }
                    arraySet.add(world);
                }
                System.out.println("Parole duplicate: " + duplicateSet);
                System.out.println("Numero di parole distinte: " + arraySet.size());
                System.out.println("Elenco di parole distinte: " + arraySet);
            } else System.out.println("Errore: numero minore di 0");
        } catch (InputMismatchException error) {
            System.out.println(error);
        }

        scanner.close();
    }
}