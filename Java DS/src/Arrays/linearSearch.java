package Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        int key=90;
        System.out.println(linearSearch(numbers, key));
    }
    static int linearSearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
    }
}
