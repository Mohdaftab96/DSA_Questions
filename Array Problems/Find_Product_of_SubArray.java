 

// int[] arr = {-2, 6, -3, -10, 0, 2};
// Maximum Product Subarray is : 180

// int[] arr = {-1, -3, -10, 0, 60};
// Maximum Product Subarray is : 60

public class Find_Product_of_SubArray{

      static int maxProductSubarray(int[] arr){

            int n = arr.length;

            int pro = 0;
            int maxPro = 0;
            for(int i=0; i<n; i++){
                  pro = arr[i];
                  if(pro > maxPro){
                        maxPro = pro;
                  }else{
                        for(int j=i+1; j<=n-1; j++){
                              pro =  pro * arr[j];
                              if(pro > maxPro){
                                    maxPro = pro;
                              }
                        }
                       
                  }
            }

            return maxPro;
      }
      
      public static void main(String[] args){

            
            // int[] arr = {-2, 6, -3, -10, 0, 2};
            int[] arr = {-1, -3, -10, 0, 60};

            // maxProductSubarray(arr);
            System.out.println("Maximum Product Subarray is : " + maxProductSubarray(arr));

            
      }
}



