package bronze5;

import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        //Math.abs로 절대값 출력
        System.out.println(Math.abs(N-M));
    }
}
