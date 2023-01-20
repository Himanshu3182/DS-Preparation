package Methods;

public class isPrimeOptimised {
    public static void main(String[] args) {
        System.out.println(isPrime(8));

    }
    static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
