

// Before Swapping : 
//  a = 5
//  b = 10
// after Swapping : 
//  a = 10
//  b = 5

// Before Swapping : 
//  a = -5
//  b = -10
// after Swapping : 
//  a = -10
//  b = -5

//=============without using 3rd variable==============


import java.util.Scanner;
public class Swap_Two_Numbers_Without_Using_3rd_Variable {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int a = -5;
            int b = -10;

            System.out.println("Before Swapping : " );
            System.out.println(" a = " + a);
            System.out.println(" b = " + b);

            

            a = a + b; // a = 30
            b = a - b; // b = 20
            a = a - b; // a = 10



            System.out.println("after Swapping : " );
            System.out.println(" a = " + a);
            System.out.println(" b = " + b);

                  
      }
}








