//Question: https://leetcode.com/problems/single-number/

import java.util.*;

public class Single {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int result = 0;

        for (int i =0; i<nums.length;i++)
        {
            nums[i] = sc.nextInt();
        }

        for (int i =0; i<nums.length;i++)
        {
            result ^= nums[i];
        }

        System.out.println(result);
    }
}