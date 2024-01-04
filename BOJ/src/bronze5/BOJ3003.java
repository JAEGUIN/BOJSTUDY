package bronze5;

import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int b = sc.nextInt();
        int kn = sc.nextInt();
        int p = sc.nextInt();

        System.out.println(1 - k);
        System.out.println(1 -q);
        System.out.println(2 - l);
        System.out.println(2 -b);
        System.out.println(2 - kn);
        System.out.println(8 - p);
    }
}
