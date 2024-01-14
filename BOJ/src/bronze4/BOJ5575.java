package bronze4;

import java.util.Scanner;

public class BOJ5575 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<3; i++){
            int bh = sc.nextInt();
            int bm = sc.nextInt();
            int bs = sc.nextInt();

            int ah = sc.nextInt();
            int am = sc.nextInt();
            int as = sc.nextInt();

            if(bs>as){
                as+=60;
                am-=1;
            }

            if(bm>am){
                am+=60;
                ah-=1;
            }
            System.out.println((ah-bh)+" "+(am-bm)+" "+(as-bs));
        }
    }
}
