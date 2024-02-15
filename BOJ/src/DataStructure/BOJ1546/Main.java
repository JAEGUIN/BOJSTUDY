package DataStructure.BOJ1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double a[] = new double[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        double max = 0;
        double sum = 0;

        for(int j=0; j<n; j++){
            if(a[j] > max){
                max = a[j];
            }
            sum += a[j];
        }

        System.out.print(sum*100/max/n);
    }
}
