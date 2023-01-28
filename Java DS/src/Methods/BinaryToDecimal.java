package Methods;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println(bcd(1000));

    }
    static double bcd(int n){
        double pow=0;
        double dec=0;
        while(n!=0){
            int i=n%10;

            dec=dec+i*(Math.pow(2,pow));
            pow++;
            n=n/10;


        }
        return dec;
    }


    }

