//Question: https://www.hackerrank.com/challenges/time-conversion/problem
//Working on this

import java.util.*;

public class TimeConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String a = String.valueOf(time.charAt(8));
        String h1 = String.valueOf(time.charAt(0));
        String h2 = String.valueOf(time.charAt(1));
        int hour = Integer.parseInt(h1.concat(h2));

        if(a.equals('A'))
        {
            System.out.println(time);
        }

        if(a.equals('P'))
        {
            hour = hour + 12; 
            String t = String.valueOf(hour);
            System.out.println(time.replace(t,h1.concat(h2)));
        }
    }
}
