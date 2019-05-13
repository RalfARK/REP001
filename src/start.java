import java.util.Scanner;

public class start {

    private static double policzSrednia(int[] tab) {
        double suma = 0;
        for (int i = 0; i < tab.length; i++){
            suma += tab[i];
        }
        return suma/tab.length;
    }

    private static int[] pobierzOceny(){
        int[] oceny = new int[4];
        Scanner inputScaner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Wprowadź ocenę: ");
            oceny[i] = inputScaner.nextInt();
        }

        return oceny;
    }

    private static void wypiszOceny(int[][] tab) {
        for (int i = 0; i < tab.length; i++){
            for (int j = 0; j < tab[i].length; j++){
                System.out.print(tab[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("zaczynamy!");
        int[][] tabPrzedmiotow = new int[3][];

        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj oceny z przedmiotu nr "+(i+1));
            tabPrzedmiotow[i] = pobierzOceny();
        }

        System.out.println("Wypisywanie ocen");
        wypiszOceny(tabPrzedmiotow);

        System.out.println("Wypisywanie sredniej");
        for (int i = 0; i < 3; i++) {
            System.out.println("srednia z przedmiotu nr " + (i+1) + " to " + policzSrednia(tabPrzedmiotow[i]));
        }

    }
}
