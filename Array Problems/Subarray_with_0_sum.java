

// arr = {4, 2, -3, 1, 6};
// Found a subarray with 0 sum  (1 to 3)

// arr = {4, 2, 0, 1, 6};
// Found a subarray with 0 sum  (at index 2)

// arr = {-3, 2, 3, 1, 6}; 
// No Such Sub Array Exists!

public class Subarray_with_0_sum{

      public static boolean subarraySumWhichComeFirst(int[] arr, int n, int sum){

           
            int x = 0;


            for(int i=0; i<n; i++){

                  x = arr[i];
                  if(x == sum){
                       return true;
                  }else{
                      
                        for(int j=i+1; j<=n-1; j++){
                              x = x + arr[j];
                              if(x == sum){
                                    return true;  
                              }
                        }
                  }  
            }
            return false;
      }
      

      
      public static void main(String[] args){

           

            // int[] arr = {4, 2, -3, 1, 6};
            // int[] arr = {-3, 2, 3, 1, 6}; 
            int[] arr = {4, 2, 0, 1, 6};
            int sum = 0;
            int n = arr.length;

            if(subarraySumWhichComeFirst(arr, n, sum)){
                  System.out.println("Found a subarray with 0 sum");
            }else{
                System.out.println("No Such Sub Array Exists!");
            }
            

            
      }
}

