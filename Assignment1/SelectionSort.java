//selection sort
package javaapplication1;
import java.util.*;
import java.lang.*;
import java.io.*;
public class SelectionSort {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers length");
	int length=sc.nextInt();
	int[] arr=new int[length];
	for(int i=0;i<length;i++)
	{
		arr[i]=sc.nextInt();
	}
        int min,min_pos;
        //min=arr[0];
        for(int i=0;i<length-1;i++)
        {
            min=arr[i];
            min_pos=i;
            for(int j=i+1;j<length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    min_pos=j;
                }
            }
            int ele1=arr[i];
            arr[i]=min;
            arr[min_pos]=ele1;
        }
    for(int i=0;i<length;i++)
    {
        System.out.print(arr[i]+" ");
    }
}
}
