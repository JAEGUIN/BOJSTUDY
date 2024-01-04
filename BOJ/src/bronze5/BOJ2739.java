package bronze5;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        for(int n = 1; n< 10; n++){
            System.out.println(i+" * "+n+" = "+i*n );
        }
    }
}
