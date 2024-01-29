package bronze3;

import java.util.Scanner;

public class BOJ2914 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();   //곡의 개수
        int I = sc.nextInt();   //평균 값

        int rs = A*(I-1)+1;
        System.out.println(rs);
    }
}
