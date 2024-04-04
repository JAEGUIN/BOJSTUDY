package TwoWeeksCodingTest.완전탐색;

import java.util.Scanner;

public class password1816 {

//    확인하고자 하는 수가 적절한 비밀번호인지 아닌지 구하는 프로그램 작성
//    적절하면 yes 아니면 no

//    적절한 비밀번호
//    모든 소인수가 1,000,000 보다 크다면 적절한 비밀번호 입니다.

//    소인수인수란?
//    1을 제외한 약수

//    인풋
//    1000036000099
//    1500035500153
//    20000000000002

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            long s = sc.nextLong();
            for(long j=2; j<=1000000; j++){
                if(s%j==0){
                    System.out.println("no");
                    break;
                }else if(j==1000000) {
                    System.out.println("yes");
                }
            }
        }

    }
}
