

// cyclically rotate an array by one

//output
// arr = {1, 2, 3, 4, 5};
// Cyclically rotate an array by one : 5 1 2 3 4 

//output
// arr = {1, 2, 3, 4, 5};
// Cyclically rotate an array by one : 2 3 4 5 1 



public class Cyclically_rotate_an_array_by_one {

      static void rightRotation(int[] arr, int n){

            int temp = arr[n-1];
            for(int i=n-1; i>0; i--){
                 arr[i] = arr[i-1]; 
            }arr[0] = temp;
            

            System.out.print("Cyclically rotate an array by one : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
      }


      public static void main(String[] args){
            
            // int[] arr = {1, 2, 3, 4, 5}; 
            int[] arr = {3, 4, 5, 1, 2}; 
            int n = arr.length;

            rightRotation(arr, n);


            // System.out.print("Right Rotation : " + rightRotation(arr, n));



      }
}