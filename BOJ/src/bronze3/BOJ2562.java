package bronze3;

import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] num = new int[9];
        int max = 0;
        int max_i = 0;

        for(int i=0; i<9; i++){
            num[i] = sc.nextInt();
            if(num[i] > max){
                max = num[i];
                max_i = i+1;
            }
        }
        System.out.println(max);
        System.out.println(max_i);
    }
}
