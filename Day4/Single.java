//Question: https://leetcode.com/problems/single-number/
//Logical bug, working on it

import java.util.*;

public class Single {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] nums = new int[n];
            int sum = 0;

            for(int i=0; i<n; i++)
            {
                nums[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++)
            {
                for(int j=1; j<n; j++)
                {
                    if(nums[i] != nums[j])
                    {
                        sum = sum + 1;
                    }
                }
            }

            System.out.println(sum);
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
