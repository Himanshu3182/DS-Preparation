package Arrays;

public class arrayAsFunctionArguments {
    public static void main(String[] args) {
        int marks[] = {98, 94, 93};
        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

    }

    static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    //Generally, the purpose of passing an array to a function is to transfer a large amount of data between methods.
    // To pass an array to a function, just pass the array as function's parameter (as normal variables),
    // and when we pass an array to a function as an argument, in actual the address of the array in the memory is
    // passed, which is the reference. Thus, any changes in the array within the method will affect the actual array
    // values.

}
