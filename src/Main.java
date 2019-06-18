import java.math.BigInteger;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Silnia z " + n + " wynosi: " + silnia(n));
    }

    public static BigInteger silnia(long n){
        BigInteger s = new BigInteger("1");
        byte a = 0b00000010;
        while(n > 1){
            s = s.multiply(BigInteger.valueOf(n));
            n--;
        }
        
        return s;
    }
}

