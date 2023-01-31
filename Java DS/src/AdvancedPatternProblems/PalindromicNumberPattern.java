package AdvancedPatternProblems;

public class PalindromicNumberPattern {
    public static void main(String[] args) {
        palindromicNumber(5);

    }
    static void palindromicNumber(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
