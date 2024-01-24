package bronze3;

import java.util.Scanner;

public class BOJ2446 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<2*n-1-i; j++){
                if(j>=i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int l=1; l<n; l++){
            for(int k=0; k<n+l; k++){
                if(l+k>=n-1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
