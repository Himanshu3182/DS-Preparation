package Methods;

public class checkPrime {
    public static void main(String[] args) {
        int num=6;
        System.out.println(isPrime(4));

    }
  static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2; i<n; i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }

        return isPrime;
  }
}
