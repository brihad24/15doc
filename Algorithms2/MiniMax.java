//Question: https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.*; 

public class MiniMax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long sum = 0;  
        long [] numbers = new long[5];
        
        for(int i=0; i<5; i++)
        {
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<5; i++)
        {
            sum = sum + numbers[i];
        }

        Arrays.sort(numbers);
        System.out.print((sum-numbers[4]+" "));
        System.out.println((sum-numbers[0]));
    }
}
