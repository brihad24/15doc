//Question = https://www.hackerrank.com/challenges/birthday-cake-candles/problem?isFullScreen=true

import java.io.*;
import java.util.Scanner;

class Candles
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//This will store the quantity of candles
        int max=0;//This is just for comparision
        int sum=0;//This is the frequency of the max height of candles.
        int height;//is the heights of each candle.
        for(int i=0;i<n;i++)
        {
            height=sc.nextInt();
            if(height>max)
            {
                sum=1;//sum is 1
                max=height;//max=5
            }
            else if(height==max)
            {
                sum++;

            }
        }
        System.out.println(sum);
    }
}
