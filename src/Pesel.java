public class Pesel {

    public static void main(String args[]){
        Pesel p = new Pesel("12345678901");
        p.toString();
    }
    String pesel;
    public Pesel(long pesel){
        this.pesel = String.valueOf(pesel);
    }
    public Pesel(String pesel){
        this.pesel = pesel;
    }
    public boolean isCorrect(){
        return false;
    }
    public boolean isMale(){
        return  (Integer.valueOf(pesel.charAt(9)) % 2 == 1);
    }
    public String born(){
        return "";
    }
    public String toString(){
        return "";
    }
}
