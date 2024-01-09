package bronze4;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int buger = Math.min(Math.min(a,b),c);
        int drink = Math.min(d, e);

        System.out.println(buger+drink-50);
    }
}
