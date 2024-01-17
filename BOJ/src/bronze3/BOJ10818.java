package bronze3;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        int min = 0;

        for(int i=0; i<n; i++){
            int num = sc.nextInt();

            if(max==0||min==0){
                max = num;
                min = num;
            }
            if(min>num){
                min = num;
            }
            if(max<num){
                max = num;
            }
        }
        System.out.print(min+" "+max);
    }
}
