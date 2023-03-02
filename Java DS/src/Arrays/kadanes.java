package Arrays;

public class kadanes {
    public static void main(String[] args) {
        int numbers[]={-1,-2,-3,-4,-5,-6};
        kadanes(numbers);

    }
    static void kadanes(int numbers[]){
        int cs=0;
        int ms= Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            cs=cs+numbers[i];

        }
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
        System.out.println("Max subarray sum is" + ms);
    }
}
