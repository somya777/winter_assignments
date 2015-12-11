//insertion sort
package javaapplication1;
import java.io.*;
import java.util.*;
import java.lang.*;

public class NewClass3 {
    public static void main (String ags[]) throws IOException
    {
            Scanner sc=new Scanner(System.in);
    System.out.println("enter the length");
    int length=sc.nextInt();
    int[] arr=new int[length];
    for(int i=0;i<length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int element,element1;
    for(int i=1;i<length;i++)
    {
        element=arr[i];
        for(int j=i-1;j>=0;j--)
        {
            if(element<arr[j])
            {
                element1=arr[j];
                arr[j]=element;
                arr[j+1]=element1;
            }
             
            
        }
    }
    for(int i=0;i<length;i++)
    {
        System.out.print(arr[i]+" ");
    }
            
    
}
}