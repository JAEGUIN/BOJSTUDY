package bronze3;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        m += t;
        if(m>59){
            h = (h+m/60)%24;
            m = m%60;
        }
        System.out.println(h+" "+m);
    }
}
