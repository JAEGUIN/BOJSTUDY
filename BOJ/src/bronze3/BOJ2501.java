package bronze3;

import java.util.Scanner;

public class BOJ2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt=0;
        int rs=0;

        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
            if(cnt==k){
                rs=i;
                break;
            }
        }
        System.out.println(rs);
    }
}
