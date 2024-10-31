

// Maximum value of arr[i] % arr[j] for a given array


// arr = {2, 3}; 
// Maximum value : 2

// arr = {2, 2, 2, 2}; 
// Maximum value : 0

// arr = {2, 4, 3, 5};
// Maximum value : 4

public class Maximum_value_of_a_given_array {

      static int computeMaxValue(int[] arr, int n){

            int max = 0;
            for(int i=0; i<n; i++){
                  int sum = 0;
                  for(int j=i+1; j<=n-1; j++){
                        
                        sum = Math.max(arr[i] % arr[j], arr[j] % arr[i]);
                  }


                  if(sum > max){
                        max = sum;
                  }
            }
            return max;
      }


      public static void main(String[] args){
            

            int[] arr = {2, 3}; // output will be 2
            // int[] arr = {2, 2, 2, 2}; // output will be 0
            // int[] arr = {2, 4, 3, 5}; // output will be 4
            int n = arr.length;

            // computeMaxValue(arr, n);


            System.out.print("Maximum value : " + computeMaxValue(arr, n));



      }
}