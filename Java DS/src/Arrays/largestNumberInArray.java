package Arrays;

public class largestNumberInArray {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,88,5,6};
        System.out.println(getLargest(numbers));

    }
    static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
}
