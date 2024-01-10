package bronze4;

import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int p = sc.nextInt();
        int lp = l*p;

        for(int i=0; i<5; i++){
            int temp = sc.nextInt()-lp;
            System.out.print(temp+" ");
        }
    }
}
