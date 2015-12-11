package homecontroller;
import java.util.*;
import java.io.*;
public class Oven {
   //public static void main(String args[]) throws IOException
    void ovenSchedule()
    {
        Scanner sc=new Scanner(System.in);
            int i=0;
            int flag;
            int start_arr[]=new int[12];
            int end_arr[]=new int[12];
            //System.out.println("enter the time");
        while(true)
        {
            System.out.println("enter the start time");
            start_arr[i]=sc.nextInt();
            System.out.println("enter the end time");
            end_arr[i]=sc.nextInt();
            flag=0;
            if(start_arr[i]<0 || start_arr[i]>24)
                flag=1;
            if(end_arr[i]<0 || end_arr[i]>24)
                flag=1;
            
            if(end_arr[i]-start_arr[i]==0)
            {
                flag=1;
            }
            for(int j=0;j<i;j++)
            {
               if(flag==1)
                   break;
                if((start_arr[i]==end_arr[j])||(end_arr[i]==start_arr[j]))
                        {
                            //System.out.println("pass1");
                           flag=1;
                    break;  
                        }
                /*if(start_arr[i]<end_arr[j])
                {
                    for(int k=0;k<i;k++)
                    {
                        if(start_arr[i]>=start_arr[j])
                        {
                            flag=1;
                            break;
                        }
                    }
                    }*/
                if(start_arr[i]<=end_arr[j] && start_arr[i]>=start_arr[j])
                {
                    //System.out.println("pass2");
                    flag=1;
                    break;
                }
                if(end_arr[i]>=start_arr[j] && end_arr[i]<=end_arr[j])
                {
                    flag=1;
                    break;
                }
                if(start_arr[i]<=start_arr[j])
                {
                    for(int k=0;k<i;k++)
                    {
                        if(end_arr[i]>=end_arr[j])
                        {
                            flag=1;
                            break;
                        }
                    }
                }
                
                
            }
            if(flag==1)
            {
                System.out.println("Invalid Input");
            }
              
            if(flag==0)
                i++;
            System.out.println("Do you want to continue 1/0");
            int cont_input=sc.nextInt();
            if(cont_input==0)
                break;
            
            
        }
    }
    
}