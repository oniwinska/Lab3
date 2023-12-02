public class Bool {

    public static boolean czyWiekszaOdZero(int x) {
        boolean wiekszaOdZero = x > 0;


        if (wiekszaOdZero) {
            System.out.println("Liczba " + x + " jest wieksza od zera.");
        } else {
            System.out.println("Liczba " + x + " nie jest wieksza od zera.");
        }


        return wiekszaOdZero;
    }

    public static boolean czyPodzielnaPrzezTrzy(int x) {
        boolean podzielnaPrzezTrzy = x % 3 == 0;


        if (podzielnaPrzezTrzy) {
            System.out.println("Liczba " + x + " jest podzielna przez 3.");
        } else {
            System.out.println("Liczba " + x + " nie jest podzielna przez 3.");
        }

        return podzielnaPrzezTrzy;
    }
}


