package bronze3;

import java.util.Scanner;

public class BOJ2443 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<n*2-i; j++){
                if(j>i){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
