package bronze3;

import java.util.Scanner;

public class BOJ2903 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 3;
        for(int i=2; i<=n; i++){
            num = num*2-1;
        }
        System.out.println(num*num);
    }
}
