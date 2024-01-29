package bronze3;

import java.util.Scanner;

public class BOJ2455 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rs = 0;
        int tmp = 0;

        for(int i=0; i<4; i++){
            int minus = sc.nextInt();
            rs = rs-minus;
            if(rs>tmp){
                tmp = rs;
            }
            int plus = sc.nextInt();
            rs = rs+plus;
            if(rs>tmp){
                tmp = rs;
            }
        }
        System.out.println(tmp);
    }
}
