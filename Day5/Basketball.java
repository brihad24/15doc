//Question: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.util.*;

public class Basketball {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int[] score = new int[games];
        int a = -1;
        int b = 10000;
        int high = 0;
        int low = 0;

        for(int i=0; i<games; i++)
        {
            score[i] = sc.nextInt();
        }
        
        for(int i=0; i<games; i++)
        {
            if(score[i] > a)
            {
                a = score[i];
                high++;
            }

            if(score[i] < b)
            {
                b = score[i];
                low++;
            }
        }

        high--;
        low--;
        System.out.println(high+" "+low);
    }
}
