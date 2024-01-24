package bronze3;

import java.util.Scanner;

public class BOJ10953 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine());
        for (int i=0; i<t; i++){
            String []tx = sc.nextLine().split(",");
            int a = Integer.parseInt(tx[0]);
            int b = Integer.parseInt(tx[1]);

            System.out.println(a+b);
        }
    }
}
