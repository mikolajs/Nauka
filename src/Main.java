import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
       int [] tab = loadData("liczby_losowe.txt");
       ZadaniaAlgorytm zad = new ZadaniaAlgorytm();
       System.out.println("Ilość liczb nieparzystych: " + zad.nieparzyste(tab));
       System.out.println("Ilość potęgi3: " + zad.potegi3(tab));
       System.out.println("Suma wszystkich cyfr: " + zad.sumaCyfr(tab));
    }

    public static void saveFile(int[] tab, String plik) {
        String dane = "";
        for(int i = 0; i < tab.length; i++) dane += tab[i] + "\n";
        try {
            Files.write(Paths.get(plik), dane.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] loadData(String plik) {
        int[] dane = new int[1000];
        Scanner sc = null;
        try {
            sc = new Scanner(new File(plik));
            for(int i = 0; i < 1000; i++) dane[i] = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dane;
    }

}

