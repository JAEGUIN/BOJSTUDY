package bronze3;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m-45<0){
            m = m+60;
            if(h==0){
                h=23;
            }else {
                h--;
            }
        }
        System.out.println(h+" "+(m-45));
    }
}
