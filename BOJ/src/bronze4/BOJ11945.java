package bronze4;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y>0){
            for(int i=0; i<x; i++){
                char[] tx = sc.next().toCharArray();
                for(int j=0; j<y; j++){
                    System.out.print(tx[y-1-j]);
                }
                System.out.println();
            }
        }
    }
}
