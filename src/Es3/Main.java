package Es3;

import Es3.entities.Rubrica;

public class Main {
    public static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        System.out.println("\n__________add__________");
        rubrica.addContact("Alessio", 1213);
        rubrica.addContact("Davide", 1234);
        rubrica.addContact("Federico", 4291);
        rubrica.addContact("Cristian", 5567);
        System.out.println(rubrica + "\n\n__________remove__________");
        rubrica.removeContact("Cristian");
        System.out.println(rubrica);
        System.out.println("\n__________searchByNumber__________");
        rubrica.searchContactByNumber(1213);
        rubrica.searchContactByNumber(1012);
        System.out.println("\n__________searchByName__________");
        rubrica.searchContactByName("Federico");
        rubrica.searchContactByName("Java");
        System.out.println("\n__________print__________");
        Rubrica.printRubrica(rubrica.getContacts());
    }
}
