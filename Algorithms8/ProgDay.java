//Question: https://www.hackerrank.com/challenges/day-of-the-programmer/problem

import java.util.*;

public class ProgDay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year > 1918)
        {
            if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            {
                System.out.println("12.09."+year);
            }

            else
            {
                System.out.println("13.09."+year);
            }
        }

        if(year < 1918)
        {
            if((year % 4 == 0))
            {
                System.out.println("12.09."+year);
            }

            else
            {
                System.out.println("13.09."+year);
            }
        }
        
        if(year == 1918)
        {
            System.out.println("26.09."+year);
        }
        
    }
}
