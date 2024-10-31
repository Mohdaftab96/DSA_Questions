



// Enter value of n : 2142534587
// Last two digits of given n : 87


// Enter value of n : 2024
// Last two digits of given n : 24


//===============Method - 01=============================

import java.util.Scanner;
public class Last_Two_digits_of_years{

      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter value of n : ");
            int n = sc.nextInt();

            int sum = 0;
            int rem = 0;
            int i=2;
            while(n > 0){

                  if(i>0){
                        rem = n % 10;
                        sum = sum * 10 + rem;
                        i = i - 1;
                  }
                  n = n / 10;
            }

            int n1 = sum;
            int sum1 = 0;
            int rem1 = 0;

            while(n1>0){
                  rem1 = n1 % 10;
                  sum1 = sum1 * 10 + rem1;
                  n1 = n1 / 10;
            }

            System.out.println("Last two digits of given n : " + sum1 + " ");
            
            

      }
}



//================Method - 02============================


/*

import java.util.Scanner;
public class Last_Two_digits_of_years{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt(); // n = 2023
            
            int sum = 0, i = 0, r;
            while(i<2){
                  r = n % 10;
                  sum = sum * 10 + r;
                  n = n / 10;
                  i++;
                  }
    
            int m = sum; // m = 32
             int  rem, s = 0;
             while(m > 0){
                   rem = m % 10;
                   s = s * 10 + rem;
                   //System.out.println(s);
                   m = m / 10;
            }
            System.out.println("Last two digits of given n : " + s);


      }        
}
*/




