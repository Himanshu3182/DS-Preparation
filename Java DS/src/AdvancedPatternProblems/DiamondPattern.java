package AdvancedPatternProblems;

public class DiamondPattern {
    public static void main(String[] args) {
        diamond(4);

    }
    static void diamond(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totRows; i>=1; i--){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
