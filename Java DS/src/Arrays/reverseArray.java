package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        reverseArray(numbers);
        for(int i=0; i<=numbers.length-1; i++){
            System.out.println(numbers[i]);
        }

    }
    static void reverseArray(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }

    }

}
