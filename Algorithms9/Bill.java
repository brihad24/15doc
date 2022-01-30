//Question: https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*;
import java.util.*;

public class Bill {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int items = in.nextInt();
        int skipped = in.nextInt();
        
        int totalToSplit = 0;
        for (int i = 0; i < items; ++i) {
            int cost = in.nextInt();
            if (i != skipped) {
                totalToSplit += cost;
            }
        }
        
        int paid = in.nextInt();
        
        if (totalToSplit / 2 >= paid) {
            System.out.println("Bon Appetit");
        }
        else {
            System.out.println(paid - totalToSplit / 2);
        }
    }
}