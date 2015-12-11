package homecontroller;
import java.io.*;
import java.lang.*;
import java.util.*;
public class HomeController {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Oven obj1=new Oven();
    WashingMachine obj2=new WashingMachine();
    Geyser obj3=new Geyser();
    System.out.println("Enter the schedule for oven in 24 hour format");
    obj1.ovenSchedule();
    System.out.println("enter the schedule for Washing Machine in 24 hour format");
  obj2.washingMachineSchedule();
    System.out.println("Enter the schedule for Geyser in 24 hour format");
    obj3.geyserSchedule();
    }
    
}
