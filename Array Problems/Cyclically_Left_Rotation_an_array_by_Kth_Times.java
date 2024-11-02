



//output
// arr = {1, 2, 3, 4, 5};
// int k = 2; // left rotation two times
// Cyclically Left Rotation an array by 2 Times : 3 4 5 1 2 



//output
// arr = {5, 4, 3, 2, 1};
// k = 3; // left rotation three times
// Cyclically Left Rotation an array by 3 Times : 2 1 5 4 3


public class Cyclically_Left_Rotation_an_array_by_Kth_Times{

      static void LeftRotationByKthTimes(int[] arr, int n, int k){

            for(int i=0; i<k; i++){
                  int temp = arr[0];
                  for(int j=0; j<n-1; j++){
                        arr[j] = arr[j+1]; 
                  }arr[n-1] = temp;
            }


            System.out.print("Cyclically Left Rotation an array by " + k + " Times : ");
            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
      }


      public static void main(String[] args){
            

            // int[] arr = {1, 2, 3, 4, 5}; 
            // int k = 2; // left rotation two times


            int[] arr = {5, 4, 3, 2, 1}; 
            int k = 3; // left rotation three times
            int n = arr.length;


            LeftRotationByKthTimes(arr, n, k);





      }
}
