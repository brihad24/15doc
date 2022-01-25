//Question: https://www.hackerrank.com/challenges/time-conversion/problem
//Working on this

import java.util.*;

public class TimeConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        Character a = time.charAt(8);
        String h = String.valueOf(time.charAt(0)).concat(String.valueOf(time.charAt(1)));
        String m = String.valueOf(time.charAt(3)).concat(String.valueOf(time.charAt(4)));
        String s = String.valueOf(time.charAt(6)).concat(String.valueOf(time.charAt(7)));
        int hour = Integer.parseInt(h);

        if(a.equals('P') && hour < 12)
        {
            hour = hour +12;
            h = String.valueOf(hour);
        }

        if(a.equals('A') && hour == 12)
        {
            h = "00";
        }
        
        System.out.println(h+":"+m+":"+s);
    }
}
