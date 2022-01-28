//Questionn: https://www.hackerrank.com/challenges/the-birthday-bar/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Chocolate{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] squares = new int[n];

        for(int squares_i=0; squares_i < n; squares_i++)
        {
            squares[squares_i] = sc.nextInt();
        }

        int d = sc.nextInt();
        int m = sc.nextInt();
        
        if(m>n)
        {
            System.out.println(0);
        }

        int ct = 0;
        int sum = 0;

        for(int i=0; i<m-1; i++)
        {
            sum+=squares[i];
        }
        
        for(int j=m-1; j<n; j++)
        {
            sum -= (j-m)<0 ? 0 : squares[j-m];
            sum += squares[j];
            if(sum==d)
                ct++;
        }
        System.out.println(ct);
    }
}