package bronze1.BOJ1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Nst = N;
        if(N<0 || N>99){
            return;
        }
        int i = 0;

        while (true){
            int a = N/10;
            int b = N%10;
            N = b*10 + (a+b)%10;
            i++;
            if(N == Nst) break;
        }
        System.out.println(i);
    }
}
