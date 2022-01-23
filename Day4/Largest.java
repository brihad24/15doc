//Question: https://leetcode.com/problems/largest-number/

import java.util.*;

public class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        String[] result = new String[n];
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
        {
          nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
          result[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(result);

        for (int i = 0; i < result.length; i++) 
        {
            nums[i] = Integer.parseInt (result[result.length-1-i]);
        }

        for(int i=0; i<n; i++)
        {
        System.out.print(String.valueOf(nums[i]));
        }
    }
}