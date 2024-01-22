package bronze3;

import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String tx = sc.nextLine();

        for(int i=0; i<tx.length(); i=i+10){
            String tmp;
            if(tx.length()>i+10){
                tmp = tx.substring(i, i+10);
            }else {
                tmp = tx.substring(i, tx.length());
            }
            System.out.println(tmp);
        }

    }
}
