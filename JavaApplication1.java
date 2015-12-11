//linear search
package javaapplication1;
import java.util.*;
import java.lang.*;
import java.io.*;
class JavaApplication1

{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the numbers length");
	int a=sc.nextInt();
	int[] arr=new int[a];
	for(int i=0;i<a;i++)
	{
		arr[i]=sc.nextInt();
	}
	int flag;
        while(true)
        {
        System.out.println("enter the item to be searched");
	flag=0;
	int b=sc.nextInt();
        for(int i=0;i<a;i++)
	{
		if(b==arr[i])
		{
		flag=1;
		i=a;
	}
	}
	if(flag==1)
	System.out.println("Item Found");
	else
	System.out.println("Item not found");
	System.out.println("Do you want to search again 1/0");
        int s1=sc.nextInt();
	if(s1==0)
            break;
}
        }
}