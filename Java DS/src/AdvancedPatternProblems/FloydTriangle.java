package AdvancedPatternProblems;

public class FloydTriangle {
    public static void main(String[] args) {
        floydTriangle(5);

    }
    static void floydTriangle(int totRows){
        int counter=1;
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            for(int j=1; j<=totRows-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
