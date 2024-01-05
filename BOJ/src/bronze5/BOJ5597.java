package bronze5;

import java.util.Scanner;

public class BOJ5597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] a = new int[31];
        for(int i=0; i<28; i++){
            int num = sc.nextInt();
            a[num]++;
        }

        for(int j=1; j<=30; j++){
            if(a[j] == 0){
                System.out.println(j);
            }
        }
    }
}
