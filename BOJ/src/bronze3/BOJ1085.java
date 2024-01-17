package bronze3;

import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();


        int min = Math.min(w-x, Math.min(h-y, Math.min(x-0, y-0)));
        System.out.println(min);
    }
}
