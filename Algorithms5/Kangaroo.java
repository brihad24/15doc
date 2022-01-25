//Question: https://www.hackerrank.com/challenges/kangaroo/problem

import java .util.*;

class Kangaroo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextInt();
        long v1 = sc.nextInt();
        long x2 = sc.nextInt();
        long v2 = sc.nextInt();

        if(v1 > v2 && (x2-x1)%(v1-v2) == 0)
        {
            System.out.println("YES");
        }

        else
        {
            System.out.println("NO");
        }
   }
}