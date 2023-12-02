import java.util.Random;
public class LiczbyLosoweWTablicy {
    public int[] uzupelnijTabJednowymiarowa(int rozmiar) {
        int[] tablica = new int[rozmiar];
        Random random = new Random();

        for (int i = 0; i < rozmiar; i++) {
            tablica[i] = random.nextInt(21);
        }

        return tablica;
    }

    public int[][] uzupelnijTabDwuwymiarowa(int liczbaWierszy, int liczbaKolumn) {
        int[][] tablica = new int[liczbaWierszy][liczbaKolumn];
        Random random = new Random();

        for (int i = 0; i < liczbaWierszy; i++) {
            for (int j = 0; j < liczbaKolumn; j++) {
                tablica[i][j] = random.nextInt(21);
            }
        }

        return tablica;
    }

    public void wyswietlTablice1(int[] tablica) {
        for (int element : tablica) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public void wyswietlTablice2(int[][] tablica) {
        for (int[] wiersz : tablica) {
            for (int element : wiersz) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
