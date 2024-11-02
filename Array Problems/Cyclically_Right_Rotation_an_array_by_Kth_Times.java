

// cyclically rotate an array by Kth Times

//output
// arr = {1, 2, 3, 4, 5};
// Cyclically rotate an array by Kth Times : 4 5 1 2 3 

//output
// arr = {4, 5, 6, 7, 8};
// Cyclically rotate an array by Kth Times : 6 7 8 4 5 


public class Cyclically_Right_Rotation_an_array_by_Kth_Times {

      static void rightRotation(int[] arr, int n, int k){

            for(int i=0; i<k; i++){

                  int temp = arr[n-1];
                  for(int j=n-1; j>0; j--){
                        arr[j] = arr[j-1]; 
                  }arr[0] = temp;

            }


            System.out.print("Cyclically rotate an array by Kth Times : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
      }


      public static void main(String[] args){
            
            // int[] arr = {1, 2, 3, 4, 5}; 
            // int k = 2; // kth times rotation
            int[] arr = {4, 5, 6, 7, 8}; 
            int n = arr.length;
            int k = 3; // kth times rotation


            rightRotation(arr, n, k);





      }
}
