package bronze3;

import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int c = sc.nextInt();

            if(c % h == 0){
                System.out.println((h*100)+(c/h));
            }else {
                System.out.println((c%h*100)+((c/h)+1));
            }
        }
    }
}
