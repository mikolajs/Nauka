import java.util.Scanner;

public class KolkoKrzyzyk {
   char[][] plansza = new char[3][3];
   Scanner sc;

   public KolkoKrzyzyk(){
       for(int i = 0; i < plansza.length; i++)
           for(int j = 0; j < plansza[i].length;j++){
               plansza[i][j] = '.';
           }
       sc = new Scanner(System.in);
   }

   private void wpiszPole(char znak){
       drukuj();
       System.out.println("wpisz pole podając rząd i kolumnę");
       int r = -1;
       int k = -1;
       do {
           r = sc.nextInt() - 1;
           k = sc.nextInt() - 1;
           } while(r < 0 || r > 2 || k < 0 || k > 2 || plansza[r][k] != '.');

       plansza[r][k] = znak;
   }

   public void graj(){
       int tura = 0;
       while (true) {
           wpiszPole('O');
           tura++;
           if(wygrana()) {
               System.out.println("Wygrał gracz O");
               return;
           }
           if(tura > 8) {
               System.out.println("KONIEC GRY: REMIS");
               return;
           }
           wpiszPole('X');
           tura++;
           if(wygrana()) {
               System.out.println("Wygrał gracz X");
               return;
           }
       }
   }

    private boolean wygrana() {
       for(int i = 0; i < plansza.length; i++) {
           if (plansza[i][0] != '.' && plansza[i][0] == plansza[i][1]
                   && plansza[i][1] == plansza[i][2]) return true;
       }
       for(int i = 0; i < plansza.length; i++) {
           if (plansza[0][i] != '.' && plansza[0][i] == plansza[1][i]
                   && plansza[1][i] == plansza[2][i]) return true;
       }
       if(plansza[0][0] != '.' && plansza[0][0] == plansza[1][1]
               && plansza[1][1] == plansza[2][2]) return true;
       if(plansza[0][2] != '.' && plansza[0][2] == plansza[1][1]
                && plansza[1][1] == plansza[2][0]) return true;
       return false;
    }

    public void drukuj(){
       for(int i = 0; i < plansza.length; i++) {
           for (int j = 0; j < plansza[i].length; j++) {
               System.out.print(plansza[i][j]);
           }
           System.out.println();
       }
   }

   @Override
   public void finalize(){
      if(sc != null) sc.close();
   }
}
