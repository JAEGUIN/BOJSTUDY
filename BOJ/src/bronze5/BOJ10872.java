package bronze5;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 1;
        int N = sc.nextInt();

        for(int i=1; i<=N; i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
