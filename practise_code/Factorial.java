//calculating factorial for big integers

import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.*;

public class Factorial{
   
    
    public static void main(String[] args) {
         int num;
    
    BigInteger fact=BigInteger.valueOf(1);
    Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        
        for(int i=1;i<=num;i++)
            {
           BigInteger ii=BigInteger.valueOf(i);
            fact=fact.multiply(ii);
        }
        System.out.println(fact);
    }
}