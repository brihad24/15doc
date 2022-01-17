//Question: https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.util.*;
import java.math.*;

public class Matrix {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int m[][] = new int[n][n];

        try
        {
        //Getting value input
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {
                m[i][j] = sc.nextInt();
                }   
            }

            //first diagonal sum
            for(int i=0; i<n; i++)
            {
                sum1 = sum1 + m[i][i];
            }
            
            //second diagonal sum
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<n; j++)
                {   
                    if((i+j) == (n-1))
                    {
                        sum2 = sum2 + m[i][j];
                    }
                }
            }

        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        System.out.println(Math.abs(sum1-sum2));
    }
}
