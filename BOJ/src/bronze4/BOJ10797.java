package bronze4;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int cnt = 0;

        for(int i=0; i<5; i++){
            int temp= sc.nextInt();
            if(a == temp){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
