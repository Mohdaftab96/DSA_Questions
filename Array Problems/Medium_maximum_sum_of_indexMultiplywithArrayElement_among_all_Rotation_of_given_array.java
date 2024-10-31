
// Enter the Array length : 4
// Enter the Array Elements : 8 3 1 2
// sum = 29


// Enter the Array length : 3
// Enter the Array Elements : 3 2 1 
// sum = 7



public class Medium_maximum_sum_of_indexMultiplywithArrayElement_among_all_Rotation_of_given_array {

      static int maxSum(int[] arr, int n){

            int max = 0;
            for(int i=0; i<n; i++){
                  int sum = 0;
                  for(int j=0; j<n; j++){
                        int index = (i+j) % n;
                        sum = sum + j * arr[index];
                  }


                  if(sum > max){
                        max = sum;
                  }
            }
            return max;
      }


      public static void main(String[] args){
            
            // int[] arr = {8, 3, 1, 2};
            int[] arr = {3, 2, 1}; // 
            int n = arr.length;

            // maxSum(arr, n);


            System.out.print("Maximum sum : " + maxSum(arr, n));



      }
}