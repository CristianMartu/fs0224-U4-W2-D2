package Es3.entities;

import java.util.HashMap;
import java.util.Set;

public class Rubrica {
    private HashMap<String, Integer> contacts;

    public Rubrica() {
        this.contacts = new HashMap<>();
    }

    public static void printRubrica(HashMap<String, Integer> list) {
        Set<String> keyContact = list.keySet();
        System.out.println("Rubrica");
        for (String contact : keyContact) {
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
        String result = "";
        Set<String> keyContact = contacts.keySet();
        for (String contact : keyContact) {
            if (number == contacts.get(contact)) result += contact;
        }
        if (result != "") System.out.println(result + ": " + number);
        else System.out.println("Nessuno numero trovato in rubrica che corrisponde a " + number);
    }

    public void searchContactByName(String name) {
        String result = "";
        Set<String> keyContact = contacts.keySet();
        for (String contact : keyContact) {
            if (name == contact) result += contacts.get(contact);
        }
        if (result != "") System.out.println(name + ": " + result);
        else System.out.println("Nessuno nome trovato in rubrica che corrisponde a " + name);
    }

    @Override
    public String toString() {
        return "Rubrica{" +
                "contacts=" + contacts +
                '}';
    }
}
