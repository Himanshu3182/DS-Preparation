package Methods;

public class isPalindrome
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(isPAlindrome(119));

    }
    static boolean isPAlindrome(int a){
        int num=a;

        int rev=0;
        while(a!=0){


            int i=a%10;
            rev=rev*10+i;

            a=a/10;


        }
        if (rev==num){
            return true;
        }

        return false;

    }


}