package bronze4;

import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        if(s + k + h >= 100){
            System.out.println("OK");
        }else if(s<k && s<h){
            System.out.println("Soongsil");
        }else if(k<s && k<h){
            System.out.println("Korea");
        }else {
            System.out.println("Hanyang");
        }
    }
}
