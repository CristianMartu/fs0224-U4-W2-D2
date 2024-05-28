package Es3.entities;

import java.util.HashMap;
import java.util.Objects;

public class Rubrica {
    private final HashMap<String, Integer> contacts;

    public Rubrica() {
        this.contacts = new HashMap<>();
    }

    public static void printRubrica(HashMap<String, Integer> list) {
        System.out.println("Rubrica");
        for (String contact : list.keySet()) {
            System.out.println("    " + contact + ": " + list.get(contact));
        }
    }

    public HashMap<String, Integer> getContacts() {
        return contacts;
    }

    public void addContact(String name, int number) {
        this.contacts.put(name, number);
    }

    public void removeContact(String name) {
        this.contacts.remove(name);
    }

    public void searchContactByNumber(int number) {
        StringBuilder result = new StringBuilder();
        for (String contact : contacts.keySet()) {
            if (number == contacts.get(contact)) result.append(contact);
        }
        if (!result.isEmpty()) System.out.println(result + ": " + number);
        else System.out.println("Nessuno numero trovato in rubrica che corrisponde a " + number);
    }

    public void searchContactByName(String name) {
        StringBuilder result = new StringBuilder();
        for (String contact : contacts.keySet()) {
            if (Objects.equals(name, contact)) result.append(contacts.get(contact));
        }
        if (!result.isEmpty()) System.out.println(name + ": " + result);
        else System.out.println("Nessuno nome trovato in rubrica che corrisponde a " + name);
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "contacts=" + contacts +
                '}';
    }
}
