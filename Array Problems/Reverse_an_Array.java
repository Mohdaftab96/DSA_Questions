

// int[] arr = {1, 2, 3, 4, 5};
// Reverse Array : 5 4 3 2 1 

// int[] arr = {10, 20, 30, 40, 50};
// Reverse Array : 50 40 30 20 10 


//============Method - 01==================

public class Reverse_an_Array {

      static void reverseArray(int[] arr, int n){


            int start = 0;
            int end = n - 1;

            int temp;
            while(start <= end){
                  temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }

            System.out.println("Reverse Array is : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
      }

      public static void main(String[] args){


            int[] arr = {1, 2, 5, 4, 3};
            int n = arr.length;
            
            reverseArray(arr, n);
            
      }
}




//=============Method - 02=================

/* 
public class Reverse_an_Array {

      static void reverseArray(int[] arr, int n){


            System.out.print("Reverse Array : ");
            for(int i=n-1; i>=0; i--){
                  System.out.print(arr[i] + " ");
            }

      }

      public static void main(String[] args){


            int[] arr = {1, 2, 3, 4, 5};
            int n = arr.length;
            
            reverseArray(arr, n);
            
      }
}

*/