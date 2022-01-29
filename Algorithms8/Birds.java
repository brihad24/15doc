//Question: https://www.hackerrank.com/challenges/migratory-birds/problem

import java.util.*;

public class Birds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] birds = new int[5];
        for (int i = 0; i < n; i++) 
        {
            birds[in.nextInt()-1]++;
        }
        
        int max = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) 
        {
            if (birds[i] > max) 
            {
                max = birds[i];
                id = i+1;
            }
        }
        System.out.println(id);
    }
}