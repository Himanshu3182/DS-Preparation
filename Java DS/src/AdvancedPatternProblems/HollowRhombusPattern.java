package AdvancedPatternProblems;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        hollowRhombus(4);

    }
    static void hollowRhombus(int totRows){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=totRows; j++){
                if(i==1||i==totRows || j==1 || j==totRows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
