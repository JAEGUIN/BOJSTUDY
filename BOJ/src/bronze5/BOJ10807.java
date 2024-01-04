package bronze5;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] nums = new int[N];

        for(int i=0; i<N; i++){
            nums[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int cnt = 0;
        for(int j=0; j<N; j++){
            if(nums[j] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
