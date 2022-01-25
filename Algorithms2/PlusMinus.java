//Question: https://www.hackerrank.com/challenges/plus-minus/problem

import java.util.*;

public class PlusMinus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double pos = 0;
        double neg = 0;
        double zer = 0;
        for(int i = 0; i<n; i++)
        {
            int a = sc.nextInt();

            if (a >= 1)
            {
                pos = pos + 1;
            }
            
            if (a < 0)
            {
                neg = neg + 1;
            }

            if (a == 0)
            {
                zer = zer + 1;
            }
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zer/n);
    }
}
