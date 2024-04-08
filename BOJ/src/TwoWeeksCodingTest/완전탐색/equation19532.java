package TwoWeeksCodingTest.완전탐색;

import java.util.Scanner;

public class equation19532 {

//    숫자 a,b,c,d,e,f 가 주어진다.
//    다음 연립방정식에서 x와 y값을 계산하는 프로그램을 작성하라.
//    ax + by = c
//    dx + ey = f
//    범위 x,y 는 -10000이상 10000이하인 정수이다.
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        for(int x = -10000; x<10001; x++){
            for(int y = -10000; y<10001; y++){
                if(a*x+b*y==c && d*x+e*y==f){
                    System.out.println(x+" "+y);
                }
            }
        }
    }
}
