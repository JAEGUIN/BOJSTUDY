package bronze3;

import java.util.Scanner;

public class BOJ2576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tmp = 0;
        int minOdd=Integer.MAX_VALUE;

        for(int i=0; i<7; i++){
            int num = sc.nextInt();

            if(num%2!=0){
                tmp = tmp+num;
                if(minOdd>num){
                    minOdd = num;
                }
            }
        }
        if(tmp==0){
            System.out.println(-1);
        }else {
            System.out.println(tmp);
            System.out.println(minOdd);
        }
    }
}
