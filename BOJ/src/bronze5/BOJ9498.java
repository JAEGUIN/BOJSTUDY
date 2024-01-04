package bronze5;

import java.util.Scanner;

public class BOJ9498 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        //새로운점 발견
        //if 다음에 else가 오면 if와 else 둘다 true가 됨
        //elseif 다음에 else가 오면 하나만 true

        if(i>= 90 && i <= 100) System.out.print("A");
        else if(i>= 80 && i <= 89) System.out.print("B");
        else if(i>= 70 && i <= 79) System.out.print("C");
        else if(i>= 60 && i <= 69) System.out.print("D");
        else System.out.print("F");

    }

}