

// arr = {1, 2, 4, 6, 3, 7, 8}
// Missing Element is : 5


// arr = {1, 2, 3, 5}
// Missing Element is : 4




public class Find_Missing_Number {

      static int missingElement(int[] arr, int n){

            int sum = 0;
            for(int i=0; i<n-1; i++){
                  sum = sum + arr[i];
            }

            int expectedSum = (n * (n + 1)) / 2;

            return expectedSum - sum;


      }

      public static void main(String args[]){
           
      // int[] arr = {1, 2, 4, 6, 3, 7, 8};
      int[] arr = { 1, 2, 3, 5 };
      int n = arr.length;


      // missingElement(arr, n);

       System.out.print("Missing Element is : " + missingElement(arr, n));

           
            
            

            
            
           
            

            
      }
}


