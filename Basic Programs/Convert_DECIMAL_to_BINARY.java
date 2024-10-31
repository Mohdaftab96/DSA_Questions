

// Enter the n number : 10
// Binary Number : 1010

// Enter the n number : 180
// Binary Number : 10110100

// Enter the n number : 3855
// Binary Number : 111100001111


import java.util.Scanner;
public class Convert_DECIMAL_to_BINARY {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the n number : ");
            int n = sc.nextInt(); // n = 10

            int rem = 0;
            String bin = "";
            while(n > 0){
                  rem = n % 2;
                  bin = rem + bin;
                  n = n/2;
            }

            System.out.println("Binary Number : " + bin);



          

            
      


                  
      }
}
