package bronze5;

import java.util.Scanner;

public class BOJ2475_R {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i=0; i<5; i++){
            int temp = sc.nextInt();
            sum += temp*temp;
        }
        System.out.println(sum%10);
    }
}
