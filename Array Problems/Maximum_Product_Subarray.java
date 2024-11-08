
 

// arr = {-2, 6, -3, -10, 0, 2};
// Maximum Product Subarray : 180


// arr = {2, 3, 4, 5, -1, 0};
// Maximum Product Subarray : 120

// arr = {-1, -3, -10, 0, 60};
// Maximum Product Subarray : 60




public class Maximum_Product_Subarray{

    static int  maxProduct(int[] arr, int n){

          int x = 0;
          int maxCount = 0;
          for(int i=0; i<n; i++){
                x = arr[i];
                if(x > maxCount){
                      maxCount = x;
                }
                for(int j=i+1; j<=n-1; j++){
                      x = x * arr[j];
                      if(x > maxCount){
                            maxCount = x;
                      }
                }
          }    
          return maxCount;
    }



    
    public static void main(String[] args){

      
        int[] arr = {-2, 6, -3, -10, 0, 2};
        // int[] arr = {-1, -3, -10, 0, 60};
        // int[] arr = {2, 3, 4, 5, -1, 0};
        int n = arr.length;

          
          // maxProduct(arr, n);

          System.out.println("Maximum Product Subarray : " + maxProduct(arr, n));
          // printArray(arr, n);
          
          
          

          
    }
}

