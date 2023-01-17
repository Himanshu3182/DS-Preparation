package PatternProblems;

public class pattern4 {
    public static void main(String[] args) {
        pattern4(5);

    }
    static void pattern4(int n){
        for(int i=0; i<2*n; i++){
            int c= i>n?2*n-i:i;
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
