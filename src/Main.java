import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Pesel pesel = new Pesel(12345678901L);
        Pesel pesel2 = new Pesel("71052203932");
        assert (pesel.isMale() == false);
        assert (pesel2.isMale() == true);

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

    public static int[] loadData(String plik)  {
        int[] dane = new int[1000];
        Scanner sc = null;
        try {
            sc = new Scanner(new File(plik));
            for(int i = 0; i < 1000; i++) dane[i] = sc.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            sc.close();
        }
        return dane;
    }

}

