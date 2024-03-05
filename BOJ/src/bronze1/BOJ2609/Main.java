package bronze1.BOJ2609;

import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        return (a*b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = gcd(a, b);
        int lcm = lcm(a, b);

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
