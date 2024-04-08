package TwoWeeksCodingTest.완전탐색;

import java.util.Scanner;

public class candy14568 {

//    친구 a,b,c에게 사탕을 나누어주려고 한다.
//    조건은 아래와 같다
//    1.남는 사탕이 없어야한다.
//    2.a는 b 보다 2개 이상 많은 사탕을 가져야한다.
//    3.셋 중 사탕을 하나도 못 받는 친구는 없어야한다.
//    4.c가 받는 사탕의 수는 짝수
//
//    분배 가능한 경우의 수를 출력하는 프로그램 작성하시오

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int candy = sc.nextInt();
        int answer = 0;

        for(int a=0; a<candy; a++){
            for(int b=0; b<candy; b++){
                for(int c=0; c<candy; c++){
                    if(a+b+c == candy){
                        if(a >= b+2){
                            if( a!=0 && b!=0 && c!=0){
                                if(c%2 ==0){
                                    answer += 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
