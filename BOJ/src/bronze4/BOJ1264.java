package bronze4;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            String tx = sc.nextLine();
            if(tx.equals("#")){
                break;
            }
            char[] txArr = tx.toCharArray();
            int cnt = 0;
            for(int i=0; i<txArr.length; i++){
                if(
                        txArr[i]=='a' || txArr[i]=='e' ||txArr[i]=='i' ||txArr[i]=='o' ||txArr[i]=='u' ||
                        txArr[i]=='A' ||txArr[i]=='E' ||txArr[i]=='I' ||txArr[i]=='O' ||txArr[i]=='U'
                ){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
