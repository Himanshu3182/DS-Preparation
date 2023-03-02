package Arrays;

public class maxSubarraySum {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        maxSubarraySum(numbers);
    }
    static void maxSubarraySum(int numbers[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int currSum=0;
            for(int j=i; j<numbers.length; j++){
                currSum=0;
                for(int k=i; k<=j; k++){
                    currSum+=numbers[k];
                } 
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum is"+maxSum);
    }
}
