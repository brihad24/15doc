//Question: https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

import java.util.*;

public class SimpleArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++)
        {
            int a = sc.nextInt();
            sum = sum+a;
        }
        System.out.println(sum);
    }
}
