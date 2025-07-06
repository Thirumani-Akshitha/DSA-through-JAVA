/*
    Pattern: Inverted Pyramid

    Input: n = 3

    Output:
    *****
     ***
      *
*/

public class Inverted_Pyramid {
    public static void nStarTriangle(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=2*n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
