//calculating number of square integers in a given range

import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args)
 {
    int testcase;
        int num1,num2;
        int count;
        double sq;
        double sq1;
        Scanner sc=new Scanner(System.in);
        testcase=sc.nextInt();
        for(int i=0;i<testcase;i++)
            {
            num1=sc.nextInt();
            num2=sc.nextInt();
            count=0;
            sq=Math.sqrt(num1);
            sq=Math.ceil(sq);
            sq1=Math.sqrt(num2);
            sq1=Math.ceil(sq1);
            
            for(double j=sq;j<=sq1;j++)
                {
                if((j*j)>=num1 && (j*j)<=num2)
                    count++;
            }
            System.out.println(count);
        }
    }
}