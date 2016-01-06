//cavity map

import java.io.*;
import java.util.*;
import java.lang.*;
public class CavityMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
            
        int dimension=sc.nextInt();
        int[][] arr=new int[dimension][dimension];
        sc.nextLine();
        for(int i=0;i<dimension;i++)
            {
            for(int j=0;j<dimension;j++)
                {
               arr[i][j]=sc.nextInt(); 
            }
            //if(i!=dimension-1)
           sc.nextLine();
        }
        
        for(int i=0;i<dimension;i++)
            {
            for(int j=0;j<dimension;j++)
                {
                if((i!=0)&&(i!=dimension-1)&&(j!=0)&&(j!=dimension-1))
                    {
                    if((arr[i][j]>arr[i-1][j])&&(arr[i][j]>arr[i+1][j])&&(arr[i][j]>arr[i][j-1])&&(arr[i][j]>arr[i][j+1]))
                        System.out.print("X");
                    else
                        System.out.print(arr[i][j]);
                }
                else
                    System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
