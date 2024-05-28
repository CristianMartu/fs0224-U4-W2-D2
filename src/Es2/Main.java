package Es2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserire quantità di numeri da visualizzare: ");
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> order = orderList(n);
        System.out.println("Lista ordinata: " + order);
        List<Integer> reverse = reverseList(order);
        System.out.println("Lista invertita: " + reverse);
        printEveOrOdd(true, order);
        printEveOrOdd(false, order);
        scanner.close();
    }

    public static List<Integer> orderList(int n) {
        List<Integer> listNumber = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listNumber.add(new Random().nextInt(100));
        }
        Collections.sort(listNumber);
        return listNumber;
    }

    public static List<Integer> reverseList(List<Integer> orderListNumber) {
        List<Integer> reverseListNumber = new ArrayList<>();
        reverseListNumber.addAll(orderListNumber);
        Collections.reverse(orderListNumber);
        reverseListNumber.addAll(orderListNumber);
        Collections.reverse(orderListNumber);
        return reverseListNumber;
    }

    public static void printEveOrOdd(boolean value, List<Integer> listNumber) {
        for (int i = 0; i < listNumber.size(); i++) {
            if (value & i % 2 == 0) System.out.println("Pari: " + listNumber.get(i));
            if (!value & i % 2 != 0) System.out.println("Dispari: " + listNumber.get(i));
        }
    }
}
