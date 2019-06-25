public class Pierwsze {

    public boolean czyPierwsza(int a){
        for(int i = 2; i <= (int) Math.sqrt(a); i++){
            if(a % i == 0) return false;
        }
        return true;
    }

    public boolean[] sito(int size){
        boolean[] pierwsze = new boolean[size+1];
        for(int i = 0; i < pierwsze.length; i++) pierwsze[i] = true;

        for(int i = 2; i < pierwsze.length; i++){
            if(pierwsze[i]) {
                int k = 2;
                while(k*i < pierwsze.length){
                    pierwsze[k*i] = false;
                    k++;
                }
            }
        }
        return pierwsze;
    }

    public void wypiszPierwsze(int max){
        boolean[] pierwsze = sito(max);
        for(int i = 2; i < pierwsze.length; i++){
            if(pierwsze[i]) System.out.print(i + " ");
        }
    }
}
