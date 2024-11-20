
// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 

// 2 
// 2 3 
// 2 3 4 

// 3 
// 3 4 

// 4 


public class Find_SUBARRAY{

      static void findSubArray(int[] arr, int n){

            for(int i=0; i<n; i++){
                  for(int j=i; j<n; j++){
                        for(int k=i; k<=j; k++){
                              System.out.print(arr[k] + " ");
                        }
                        System.out.println();    
                  }
                  System.out.println();
            }
            
      }

      public static void main(String[] args){

      
            // int[] arr = {1, 2, 3};
            int[] arr = {1, 2, 3, 4};
            int n = arr.length;

           findSubArray(arr, n);
            

      }
      
}

