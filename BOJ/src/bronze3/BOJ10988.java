package bronze3;

import java.util.Scanner;

public class BOJ10988 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char[] tx = sc.nextLine().toCharArray();
        int startIndex = 0;
        int endIndex = tx.length-1;
        boolean isF = true;

        while(startIndex<endIndex){
            if(tx[startIndex]!=tx[endIndex]){
                isF = false;
                break;
            }
            startIndex++;
            endIndex--;
        }
        if(isF==true){
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
