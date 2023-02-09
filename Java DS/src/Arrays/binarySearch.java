package Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int numbers[]={80,85,88,89,90};
        int key=90;
        System.out.println(binarySearch(numbers, key));
    }
    static int binarySearch(int numbers[], int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end=mid-1;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }
        }
        return -1;

    }
}
