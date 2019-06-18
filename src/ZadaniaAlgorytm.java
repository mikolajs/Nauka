public class ZadaniaAlgorytm {

    public int nieparzyste(int[] dane){
        int ile = 0;
        for(int e: dane){
            if(e % 2 != 0 && e % 3 != 0 && e % 5 != 0) ile++;
        }
        return ile;
    }

    public int potegi3(int[] dane){
        int ile = 0;
        for(int e: dane){
            while(e > 1){
                if(e % 3 != 0) break;
                e /= 3;
                if(e == 1) ile++;
            }
        }
        return ile;
    }

    public int sumaCyfr(int[] dane){
        int suma = 0;
        for(int e: dane){
            while(e > 0){
                suma += e % 10;
                e /= 10;
            }
        }
        return suma;
    }
}
