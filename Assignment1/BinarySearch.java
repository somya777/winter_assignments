package javaapplication1;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BinarySearch {
    public static void main (String[] args) throws java.lang.Exception
	{
            System.out.println("binary search");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers length");
	int a=sc.nextInt();
	int[] arr=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=sc.nextInt();
	}
        System.out.println("enter the item to be searched");
	int search_item=sc.nextInt();
        Arrays.sort(arr);
        int last_position=a-1;
        int first_position=0;
        while(true)
        {
            int mid=(last_position+first_position)/2;
            if(arr[mid]==search_item)
            {
                System.out.println("Element found");
                break;
            }
            else if(arr[mid]>search_item)
            {
                last_position=mid-1;
            }
            else
                first_position=mid+1;
        }
    
}
}
