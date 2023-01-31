package AdvancedPatternProblems;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        NumberPyramid(7);

    }
    static void NumberPyramid(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
