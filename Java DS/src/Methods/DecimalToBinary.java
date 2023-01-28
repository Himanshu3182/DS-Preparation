package Methods;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(dcb(5));

    }
    static int dcb(int num){
        int bin=0;
        int pow=0;
        while(num!=0){
            int i=num%2;
            bin=bin+i*((int)Math.pow(10,pow));
            pow++;
            num=num/2;

        }
        return bin;
    }
}
