package bronze4;

import java.util.Locale;
import java.util.Scanner;

public class BOJ5524 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String a = sc.next();
            String b = a.toLowerCase();
            System.out.println(b);
        }
    }
}
