public class Pesel {

    String pesel;
    public Pesel(long pesel){
        this.pesel = String.valueOf(pesel);
    }
    public Pesel(String pesel){
        this.pesel = pesel;
    }
    public boolean isCorrect(){
        long p = Long.valueOf(pesel);
        long kontrolna = p % 10;
        p /= 10;
        int suma = 0;
        int[] tab = { 3, 1, 9, 7, 3, 1, 9, 7, 3, 1};
        for(int c : tab){
            suma += c * (p % 10);
            p /= 10;
        }
        if(suma % 10 == 0) return kontrolna == 0;
        else {
          return kontrolna == (10 - (suma % 10));
        }
    }
    public boolean isMale(){
        return  (Integer.valueOf(pesel.charAt(9)) % 2 == 1);
    }
    public String born(){
        String day = pesel.substring(4,6);
        int m = Integer.valueOf(pesel.substring(2,4));
        String month = "";
        String year = "";
        if(m > 12) {
            m -= 20;
            year += "20";
        } else { year += "19"; }
        month = String.valueOf(m);
        if(month.length() == 1) month = "0" + month;
        year += pesel.substring(0,2);
        return day + "-" + month + "-" + year;
    }
    public String toString(){
        if(isCorrect()){
            String plec = "";
            if(isMale()) plec = "mężczyzna"; else plec = "kobieta";
            return "Urodzony: " + born() + ", płeć: " + plec;
        } else {
            return "Pesel niepoprawny!";
        }
    }
}
