


// Enter days : 2880
// Total Years : 7
// Total Months : 10
// Total Weeks : 3
// Total days : 4

// Enter days : 1446
// Total Years : 3
// Total Months : 11
// Total Weeks : 3
// Total days : 0

import java.util.Scanner;
public class Convert_Total_Days_into_Years_Months_Weeks_and_Days {

      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            
            System.out.print("Enter days : ");
            int n = sc.nextInt(); 


            int years = n / 365; 
            int m = n % 365; 
            System.out.println("Total Years : " + years);
            

            int months = m / 30; 
            m = m % 30;
            System.out.println("Total Months : " + months);
            


            int weeks = m / 7; 
            m  = m % 7;
            System.out.println("Total Weeks : " + weeks);
            

            int days = m; 
            System.out.println("Total days : " + days);
            
            

      }
}