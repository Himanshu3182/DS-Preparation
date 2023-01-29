package AdvancedPatternProblems;

public class invertedHalfNumberPattern {
    public static void main(String[] args) {
        invertedHalfNumber(6);

    }
    static void invertedHalfNumber(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i+1; j++){
                System.out.print(j);
            }
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
