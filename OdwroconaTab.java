public class OdwroconaTab {


    public static void odwrocTablice(int[] odwroconaTablica)
    {
        for (int i = 0, j = odwroconaTablica.length - 1; i < j; i++, j--)
        {
            int temp = odwroconaTablica[i];
            odwroconaTablica[i] = odwroconaTablica[j];
            odwroconaTablica[j] = temp;
        }
    }


    public static void wyswietlTablice(int[] wyswietlanaTablica)
    {
        for (int element : wyswietlanaTablica)
        {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
