package Methods;

public class primesInRange {
    public static void main(String[] args) {
    primesInRange(20);
    }
    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    static void primesInRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }

    }


}
