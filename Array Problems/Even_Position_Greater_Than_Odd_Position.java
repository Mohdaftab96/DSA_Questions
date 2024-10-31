
//-------Rearrange array such that even position are greater than odd  position--------

// Enter the Size of Array : 6
// Enter the Array Elements : 15 12 13 18 5 9
// Even Position is greater than odd position : 15 12 18 13 9 5


// Enter the Size of Array : 7
// Enter the Array Elements : 1 2 3 4 5 6 7
// Even Position is greater than odd position : 2 1 4 3 6 5 7 


//=============Method - 01=======Tc: O(n)==================

 
import java.util.Scanner;
public class Even_Position_Greater_Than_Odd_Position{

      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            

            System.out.print("Enter the Size of Array : ");
            int n = sc.nextInt();


            int [] arr = new int[n];


            System.out.print("Enter the Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt(); // 1 2 3 4 5  
            }

            int temp = 0;
            for(int i=0; i<n-1; i++){
                  if(arr[i] < arr[i+1]){
                        if(i%2 == 0){
                              temp = arr[i];
                              arr[i] = arr[i+1];
                              arr[i+1] = temp;
                        }
                  }
            }

      
            
            System.out.print("Even Position is greater than odd position : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");  
            }        
            

      }
}




//=============Method - 01=======Tc: O(n^2)==================


// Enter Array length : 6
// Enter the Array Elements : 15 12 13 18 5 9
// 18 12 15 13 9 5 


// Enter Array length : 7
// Enter the Array Elements : 1 2 3 4 5 6 7
// 7 1 6 2 5 3 4 




/*
import java.util.Scanner;
public class Even_Position_Greater_Than_Odd_Position{

      public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Array length : ");
            int n = sc.nextInt(); // n = 6

            int[] arr = new int[n];

            System.out.print("Enter the Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] < arr[j]){
                              if(i%2 == 0){
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                              }
                        }
                  }
            }

            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }


            
      }
} 

 */