
// Enter value of n : 10
// Fibbonacci Series : 0 1 1 2 3 5 8 13 21 34 

// Enter value of n : 5
// Fibbonacci Series : 0 1 1 2 3



import java.util.Scanner;
public class Fibbonacci_Series {
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter value of n : ");
            int n = sc.nextInt(); // n = 10

            int a = 0;
            int b = 1;


            System.out.print("Fibbonacci Series : ");
            System.out.print(a + " ");  //printing 0     
            System.out.print(b + " ");  //printing 1

            for(int i=2; i<n; i++){ // //loop starts from 2 because 0 and 1 are already printed
                  int c = a + b;
                  System.out.print(c + " ");
                  a = b;
                  b = c;
            }






            

                  
      }
}
