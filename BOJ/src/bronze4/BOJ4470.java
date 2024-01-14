package bronze4;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++){
            String tx = sc.nextLine();
            System.out.println(i+". "+tx);
        }
    }
}
