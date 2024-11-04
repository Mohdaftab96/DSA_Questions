

// arr =  {15, 2, 4, 8, 9, 5, 10, 23};
// int sum = 23;
// 2 5(output)

// arr = {1, 4, 0, 0, 3, 10, 5};
// sum = 7;
// 2 5(output)

// arr = {1, 4};
// sum = 0;
// -1



public class Subarray_with_Given_Sum {

      static void countOccurrences(int[] arr, int sum, int n){

            boolean flag = false;
            int x = 0;


            for(int i=0; i<n; i++){

                  x = arr[i];
                  if(x == sum){
                        int a = i+1; //inreasing index by adding 1 if value found
                        System.out.println(a + " ");
                        flag = true;

                        
                  }else{

                        for(int j=i+1; j<=n-1; j++){
                              x = x + arr[j];
                              if(x == sum){
                                    int b = i + 1; //inreasing index by adding 1 if value found
                                    int c = j + 1; ///inreasing index by adding 1 if value found
                                    System.out.println(b + " " + c);
                                    flag = true;
                                    
                              }
                        }
                        
                  } 
                  if(flag == true){
                        break;
                  }     
            }

            if(flag != true){
                  System.out.println("-1");
            }
            

           
            
      }

      public static void main(String args[]){
            
            int[] arr =  {15, 2, 5, 8, 9, 5, 10, 23};
            int sum = 23; // Given 

            // int[] arr = {1, 4, 0, 0, 3, 10, 5};
            // int sum = 7;

            // int[] arr = {1, 4};
            // int sum = 7;


            int n = arr.length;
            

            countOccurrences(arr, sum, n);


            

            
            

            
            


             

            
      }
}