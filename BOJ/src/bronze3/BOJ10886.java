package bronze3;

import java.util.Scanner;

public class BOJ10886 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int c = 0;
        int nc = 0;

        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            if(v==0){
                nc++;
            }else if(v==1){
                c++;
            }
        }
        if(c>nc){
            System.out.println("Junhee is cute!");
        }else if(nc>c){
            System.out.println("Junhee is not cute!");
        }
    }
}
