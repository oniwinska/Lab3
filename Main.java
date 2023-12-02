import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //zad1
        /*
        String lancuchZnakow = "12345";

        int lancuchZnakowToInt = Integer.parseInt(lancuchZnakow);
        long lancuchZnakowToLong = Long.parseLong(lancuchZnakow);
        float lancuchZnakowToFloat = Float.parseFloat(lancuchZnakow);
        double lancuchZnakowToDouble = Double.parseDouble(lancuchZnakow);

        System.out.println("Wartosc poczatkowa: "+ lancuchZnakow);
        System.out.println("Wartosc po konwersji na int: "+ lancuchZnakowToInt);
        System.out.println("Wartosc po konwersji na long: "+ lancuchZnakowToLong);
        System.out.println("Wartosc po konwersji na float: "+ lancuchZnakowToFloat);
        System.out.println("Wartosc po konwersji na dobule: "+ lancuchZnakowToDouble);
         */

        //zad2
        /*
        int x = -5;
        int wartoscBezwzglednaX;

        wartoscBezwzglednaX = x>=0 ? x : -x;

        System.out.println("Wartosc bazwzgledna liczby "+ x +" jest rowna "+ wartoscBezwzglednaX);
        */

        //zad3
/*
        for (int i=0;i <10; i++)
        {
            System.out.println(i);
            if (i==4)
            {
                break;
            }
            System.out.println("Dzialam");
        }

        for (int i=0; i<10; i++)
        {
            if(i % 2 ==0)
            {
                continue;
            }
            System.out.println(i);
        }
  */
        //zad 4
        /*
        int a = 2;
        int b = 4;


        int x = a + b;

        System.out.println(x);

        x = a - b;
        System.out.println(x);

        x = a * b;
        System.out.println(x);

        x = b / a;
        System.out.println(x);

        x = b % a ;
        System.out.println(x);


        int c = 3;
        x = a+b-c;
        System.out.println(x);

        x = a-b+c;
        System.out.println(x);

        x = a+b*c;
        System.out.println(x);

        x = c+b/a;
        System.out.println(x);

        x = c + b % 2;
        System.out.println(x);

        x = c * b % 2;
        System.out.println(x);
     */

        //zad5
     /*
        String wyraz1 = new String("Hej");
        String wyraz2 = new String("Hej");
        String wyraz3 = wyraz1;

        System.out.println("Operator == :");
        System.out.println(wyraz1 == wyraz2);
        System.out.println(wyraz1 == wyraz3);

        System.out.println("Metoda equals :");
        System.out.println(wyraz1.equals(wyraz2));
        System.out.println(wyraz1.equals(wyraz3));
            }
        }

      */

    //zad6 (metody w klasie OdwroconaTab)

        /*
        int[] tablica1 = {1,2,3,4,5};

        OdwroconaTab.wyswietlTablice(tablica1);
        OdwroconaTab.odwrocTablice(tablica1);
        OdwroconaTab.wyswietlTablice(tablica1);

*/
        //zad7
/*
                // args to parametry programu przekazane z wiersza poleceń
                // args.length to liczba przekazanych parametrów
                System.out.println("Liczba parametrów: " + args.length);
                // Wyświetlenie wszystkich przekazanych parametrów
                for (int i = 0; i < args.length; i++) {
                    System.out.println("Parametr " + i + ": " + args[i]);
                }
                */
         //zad8 (Metody w klasie Bool)
        /*
        int liczba = 7;


        if (Bool.czyWiekszaOdZero(liczba) && Bool.czyPodzielnaPrzezTrzy(liczba)) {
            System.out.println("Liczba " + liczba + " spelnia oba warunki.");
        } else {
            System.out.println("Liczba " + liczba + " nie spełnia obu warunkow jednoczesnie.");
        }

        if (args.length < 2) {
            System.out.println("Podaj co najmniej dwie liczby jako argumenty programu.");
            return;
        }

         */
//zad9
/*

        if (args.length < 2)
        {
            System.out.println("Podaj co najmniej dwie liczby jako argumenty programu.");
            return;
        }

        int liczba1 = Integer.parseInt(args[0]);
        int liczba2 = Integer.parseInt(args[1]);


        System.out.println("Liczba 1: " + liczba1);
        System.out.println("Liczba 2: " + liczba2);
        System.out.println("Suma: " + (liczba1 + liczba2));
        System.out.println("Roznica: " + (liczba1 - liczba2));
        System.out.println("Iloczyn: " + (liczba1 * liczba2));


        if (liczba2 != 0) {
            System.out.println("Iloraz: " + (liczba1 / liczba2));
        } else {
            System.out.println("Nie można dzielić przez zero.");
        }

*/
        //zad 10 (Metody w klasie LiczbyLosoweWTablicy)


        LiczbyLosoweWTablicy uzupelnianie = new LiczbyLosoweWTablicy();


        int[] jednowymiarowaTablica = uzupelnianie.uzupelnijTabJednowymiarowa(20);
        System.out.println("Jednowymiarowa tablica:");
        uzupelnianie.wyswietlTablice1(jednowymiarowaTablica);


        int[][] dwuwymiarowaTablica = uzupelnianie.uzupelnijTabDwuwymiarowa(4, 5);
        System.out.println("\nDwuwymiarowa tablica:");
        uzupelnianie.wyswietlTablice2(dwuwymiarowaTablica);
    }
    }






