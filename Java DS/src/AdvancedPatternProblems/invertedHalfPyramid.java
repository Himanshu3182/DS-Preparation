package AdvancedPatternProblems;

public class invertedHalfPyramid {
    public static void main(String[] args) {
        invertedHalfPyramid(5);

    }
    static void invertedHalfPyramid(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("*");

                        }
            System.out.println();
        }
    }
}
