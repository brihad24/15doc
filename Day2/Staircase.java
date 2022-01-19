//Question: https://www.hackerrank.com/challenges/staircase/problem
//Still figuring this out

import java.util.*;

public class Staircase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int k=0; k<n; k++)
        {
            String a = " ";
        }

        for(int i=0; i<=n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
