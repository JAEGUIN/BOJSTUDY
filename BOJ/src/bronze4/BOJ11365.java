package bronze4;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String tx = sc.nextLine();
            if(tx.equals("END")){
                break;
            }
            char[] txArr = tx.toCharArray();

            for(int i=0; i<txArr.length; i++){
                System.out.print(txArr[txArr.length - 1 - i]);
            }
            System.out.println();
        }
    }
}
