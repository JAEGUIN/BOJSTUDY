package bronze5;

import java.util.Scanner;

public class BOJ25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = N/4;
        for(int i=0; i<n; i++){
            System.out.println("long");
        }
        System.out.println("int");
    }
}
