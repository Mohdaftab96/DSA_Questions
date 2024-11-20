



// int[] arr = {2, 5, 2};
// Element that appears once in given Array is: 5


// int[] arr = {2, 3, 5, 4, 5, 3, 4};
// Element that appears once in given Array is: 2


//===============================Method: 01===============================



public class Element_that_appears_once_in_an_array_where_every_other_element_appears_twice{

      static int findSubArray(int[] arr, int n){


            int x = arr[0]; // x = 2
            for(int i=1; i<n; i++){
                  x = x ^ arr[i]; // // Here using XOR Operation
            }

            return x;
            
      }

      public static void main(String[] args){

      
            int[] arr = {2, 3, 5, 4, 5, 3, 4};
            // int[] arr = {2, 5, 2};
            // int[] arr = {3};
            int n = arr.length;

            // findSubArray(arr, n);
            System.out.print("Element that appears once in given Array is: " + findSubArray(arr, n));
            
            

      }
      
}




//=======================================Method: 02======================================================

/* 
public class Element_that_appears_once_in_an_array_where_every_other_element_appears_twice{

      static void findSubArray(int[] arr, int n){


            int x = arr[0]; // x = 2
            for(int i=0; i<n; i++){
                  int count = 0;
                  for(int j=0; j<n; j++){
                        if(arr[i] == arr[j]){
                              count = count + 1;
                        }
                  }
                  if(count == 1){
                        System.out.print(arr[i] + " ");
                        
                  }
            }

            
      }

      public static void main(String[] args){

      
            int[] arr = {2, 3, 5, 4, 5, 3, 4};
            // int[] arr = {2, 5, 2};
            // int[] arr = {3};
            int n = arr.length;

            findSubArray(arr, n);
            // System.out.print("Element that appears once in given Array is: " + findSubArray(arr, n));
            
            

      }
      
}

*/
