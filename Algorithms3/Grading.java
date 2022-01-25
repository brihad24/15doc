//Question: https://www.hackerrank.com/challenges/grading/problem

import java.util.*;

public class Grading{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];

        for(int i=0; i<n; i++)
        {
            marks[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++)
        {
            if(marks[i] > 35)
            {
                if(((marks[i]+1) % 5) == 0)
                {
                    marks[i] = marks[i] + 1;
                }

                else if(((marks[i]+2) % 5) == 0)
                {
                    marks[i] = marks[i] + 2;
                }
            }    
            System.out.println(marks[i]);
        }
    }
}