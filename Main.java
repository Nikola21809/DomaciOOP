
public class Main {
	public static void main(String[] args) {
        int a = 24;
        int b = 12;

        char operation = '+';

        System.out.println("Prvi broj: " + a);
        System.out.println("Drugi broj: " + b);
        System.out.println("Izabrana operacija: " + operation);
        System.out.println("----------------------------");

        if (operation == '+') {
            int rezultat = a + b;
            System.out.println("Rezultat sabiranja: " + rezultat);
        } else if (operation == '-') {
            int veci = Math.max(a, b);
            int manji = Math.min(a, b);
            int rezultat = veci - manji;
            System.out.println("Rezultat oduzimanja (" + veci + " - " + manji + "): " + rezultat);
        } else if (operation == '*') {
            int rezultat = a * b;
            System.out.println("Rezultat množenja: " + rezultat);
        } else if (operation == '/') {
            if (b != 0) {
                double rezultat = (double) a / b;
                System.out.println("Rezultat deljenja: " + rezultat);
            } else {
                System.out.println("Greška: Deljenje nulom nije dozvoljeno!");
            }
        } else {
            System.out.println("Nepoznata računski operacija!");
        }
    }
}
