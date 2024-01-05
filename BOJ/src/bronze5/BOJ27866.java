package bronze5;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String tx = sc.next();
        int index = sc.nextInt();
        System.out.println(tx.charAt(index-1));
    }
}
