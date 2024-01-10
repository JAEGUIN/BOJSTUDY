package bronze4;

import java.util.Scanner;

public class BOJ25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int N = sc.nextInt();
        long temp = 0;

        for(int i=0; i<N; i++){
            long a = sc.nextLong();
            int b = sc.nextInt();

            temp += a*b;
        }

        if(temp == X){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
