package bronze5;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //float - 소수점 6~7 자리
        //double - 소수점 15~16자리
        //double이 정확도가 더 높아서 코테에 유리하다.
        double A = sc.nextInt();
        double B = sc.nextInt();
        System.out.println(A/B);
    }
}
