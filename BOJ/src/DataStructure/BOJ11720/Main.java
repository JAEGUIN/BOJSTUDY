package DataStructure.BOJ11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            sum += c - '0';
        }
        System.out.print(sum);
    }
}
