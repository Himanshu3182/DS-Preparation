package AdvancedPatternProblems;

public class SolidRhombusPattern {
    public static void main(String[] args) {
        solidRhombus(5);

    }
    static void solidRhombus(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=totRows; j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
