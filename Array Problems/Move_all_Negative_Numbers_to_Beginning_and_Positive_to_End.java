

// arr =  {1, -1, 3, 4, -2, 5, -3};
// Moving Negitive Starting Pos. and Positive Ending Pos : -3 -2 -1 1 3 4 5


// arr =  {-12, 11, -13, -5, 6, -7, 5, -3, -6};
// Moving Negitive Starting Pos. and Positive Ending Pos : -13 -12 -7 -6 -5 -3 5 6 11



public class Move_all_Negative_Numbers_to_Beginning_and_Positive_to_End {


      static void moveNegStartingAndPosEnd(int[] arr, int n){

            int temp;
            for(int i=0; i<n; i++){
                  for(int j=i+1; j<=n-1; j++){
                        if(arr[i] > arr[j]){
                              temp = arr[i];
                              arr[i] = arr[j];
                              arr[j] = temp;
                        }
                  }
            }   
      }

      static void printArray(int[] arr, int n){

            for(int i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }

      }

      public static void main(String args[]){
            
            // int[] arr =  {1, -1, 3, 4, -2, 5, -3};
            int[] arr =  {-12, 11, -13, -5, 6, -7, 5, -3, -6};

            int n = arr.length;
            

            moveNegStartingAndPosEnd(arr, n);
            System.out.print("Moving Negitive Starting Pos. and Positive Ending Pos : ");
            printArray(arr,n);


            

            
      }
}



