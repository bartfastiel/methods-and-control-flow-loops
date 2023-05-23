package org.example;

public class Main {
    public static void main(String[] args) {
        congratulate("Daniel");
        congratulate("Florian");
        congratulate("Marcell");
        String summary = composeSummary();
        System.out.println(summary);
    }

    public static void congratulate(String name) {
        System.out.println("Hallo " + name);
        System.out.println("Heute ist Dein Geburtstag!");
        for (int countD = 0; countD < 3; countD++) {
            System.out.println("Hurra!");
        }
    }

    public static String composeSummary() {
        return "Alles Gute euch 3en";
    }
}
