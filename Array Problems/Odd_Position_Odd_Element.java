
// Enter the Array length : 6
// Enter Array Elements : 2 1 4 4 5 7
// Even Position Odd Element : 1 7 

import java.util.Scanner;
public class Odd_Position_Odd_Element {

      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Array length : ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
            }


            System.out.print("Odd Position Odd Element : ");
            for(int i=0; i<n; i++){
                  if(arr[i]%2 == 1 && i%2 == 1){
                        System.out.print(arr[i] + " ");
                  }
            }


            
            
            

      }
}