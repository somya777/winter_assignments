package homecontroller;
import java.util.*;
import java.io.*;
public class Geyser {
    void geyserSchedule()
    {
        Scanner sc=new Scanner(System.in);
            int i=0;
            int flag;
            int start_arr2[]=new int[12];
            int end_arr2[]=new int[12];
            //System.out.println("enter the time");
        while(true)
        {
            System.out.println("enter the start time");
            int a=sc.nextInt();
            System.out.println("enter the end time");
            int b=sc.nextInt();
            if((b-a)>2)
            {
                start_arr2[i]=a;
                end_arr2[i]=a+2;
            }
            else
            {
                start_arr2[i]=a;
                end_arr2[i]=b;
            }
            flag=0;
            if(start_arr2[i]<0 || start_arr2[i]>24)
                flag=1;
            if(end_arr2[i]<0 || end_arr2[i]>24)
                flag=1;
            
            if(end_arr2[i]-start_arr2[i]==0)
            {
                flag=1;
            }
            for(int j=0;j<i;j++)
            {
               if(flag==1)
                   break;
                if((start_arr2[i]==end_arr2[j])||(end_arr2[i]==start_arr2[j]))
                        {
                            System.out.println("pass1");
                           flag=1;
                    break;  
                        }
               /* if(start_arr[i]<end_arr[j])
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
                if(start_arr2[i]<=end_arr2[j] && start_arr2[i]>=start_arr2[j])
                {
                    //System.out.println("pass2");
                    flag=1;
                    break;
                }
                if(end_arr2[i]>=start_arr2[j] && end_arr2[i]<=end_arr2[j])
                {
                    flag=1;
                    break;
                }
                if(start_arr2[i]<=start_arr2[j])
                {
                    for(int k=0;k<i;k++)
                    {
                        if(end_arr2[i]>=end_arr2[j])
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
