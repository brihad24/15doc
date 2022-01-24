//Question: https://www.hackerrank.com/challenges/kangaroo/problem

import java .util.*;

class Kangaroo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v1 = sc.nextInt();
        int v2 = sc.nextInt();

        for(int i=0; i<=10000; i++)
        {
            x1 = x1 + v1;
            x2 = x2 + v2;

            if((x1+v1) == (x2+v2))
            {
                System.out.println("YES");
                break;
            }
            
            if((x1+v1) != (x2+v2) && i == 10000)
            {
                System.out.println("NO");
            }
        }
    }
}