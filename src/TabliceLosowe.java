import java.util.Random;

public class TabliceLosowe {
    int[] tab;
    Random r = new Random();

    public TabliceLosowe(int size){
        this.tab = new int[size];
        losuj();
    }

    private void losuj() {
        for (int i = 0; i < tab.length; i++) tab[i] = r.nextInt(1_000_000);
    }

    public int[] pobierz(){
        return tab;
    }

    public void znajdzMaxMin(){
        int min = 1_000_000;
        int max = 0;
        for(int e : tab){
            if(min > e) min = e;
            else if(max < e) max = e;
        }
        System.out.println("Minimum: " + min + " maksimum: " + max);
    }

}
