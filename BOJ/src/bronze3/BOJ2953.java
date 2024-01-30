package bronze3;

import java.util.Scanner;

public class BOJ2953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int mu = 0;
        int mus = 0;

        int s = 0;


        for(int i=1; i<=5; i++){
            for(int j=1; j<=4; j++){
                int tmp = sc.nextInt();
                s += tmp;
            }
            if(s>mus){
                mus = s;
                mu = i;
            }
            s=0;
        }
        System.out.println(mu+" "+mus);
    }
}
