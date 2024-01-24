package bronze3;

import java.util.Scanner;

public class BOJ2566 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int max_i = 1;
        int max_j = 1;

        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                int tmp = sc.nextInt();
                if(max < tmp){
                    max = tmp;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_i+" "+max_j);
    }
}
