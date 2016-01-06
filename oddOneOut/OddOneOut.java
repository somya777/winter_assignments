//package oddoneout;
import java.util.Scanner;
import java.io.*;
public class OddOneOut {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int length=sc.nextInt();
        int[] list=new int[length];
        for(int i=0;i<length;i++)
        {
            list[i]=sc.nextInt();
        }
        while(length!=1)
        {
            for(int i=0,k=0;k<length/2;i+=2,k++)
                list[k]=list[i+1];
            length=length/2;
        }
        System.out.println("final is:"+list[0]);
    }
}
