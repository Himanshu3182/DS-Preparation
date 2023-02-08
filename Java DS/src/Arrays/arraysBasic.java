package Arrays;

public class arraysBasic {
    public static void main(String[] args) {
        int marks[]=new int[50];
        for(int i=0; i<50; i++){
            marks[i]=i;

        }
        for(int i=0; i<50;i++){
            System.out.println(marks[i]);
        }
        System.out.println("length of array is "+ marks.length);

        String fruits[]=new String[50];
        fruits[1]="Mango";
        fruits[2]="Apple";
        fruits[3]="Banana";
        for(int i=0; i<4;i++){
            System.out.println(fruits[i]);
        }



    }
}
