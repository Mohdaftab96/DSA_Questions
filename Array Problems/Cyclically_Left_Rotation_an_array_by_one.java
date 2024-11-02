



//output
// arr = {1, 2, 3, 4, 5};
// Cyclically Left Rotation an array by one : 2 3 4 5 1  

//output
// arr = {5, 4, 3, 2, 1};
// Cyclically Left Rotation an array by one : 4 3 2 1 5 


public class Cyclically_Left_Rotation_an_array_by_one {

      static void LeftRotationByOne(int[] arr, int n){

            // for(int i=0; i<k; i++){
                  int temp = arr[0];
                  for(int i=0; i<n-1; i++){
                        arr[i] = arr[i+1]; 
                  }arr[n-1] = temp;
            // }


            System.out.print("Cyclically Left Rotation an array by one : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
      }


      public static void main(String[] args){
            
            // int[] arr = {1, 2, 3, 4, 5}; 

            
            int[] arr = {5, 4, 3, 2, 1}; 
            int n = arr.length;


            LeftRotationByOne(arr, n);





      }
}