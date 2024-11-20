

// arr = {10, 20, 30, 40, 50};
// target = 45;
// Element is not present in array

// arr = {1, 2, 3, 4};
// target = 3;
// Element is present at index: 2

// arr = {10, 8, 30, 4, 5};
// target = 5;
// Element is present at index: 4

// arr = {10, 8, 30};
// target = 6;
// Element is not present in array


public class Linear_Search{

    static int linearSearchAlgo(int[] arr, int n, int target){

          
          for(int i=0; i<n; i++){
                if(arr[i] == target) {
                      return i;
                }  
          }
          return -1;
                
    }


    public static void main(String[] args){

          // int[] arr = {10, 20, 30, 40, 50};
          // int target = 45;

          // int[] arr = {1, 2, 3, 4};
          // int target = 3;

          // int[] arr = {10, 8, 30, 4, 5};
          // int target = 5;


          int[] arr = {10, 8, 30};
          int target = 6;
          int n = arr.length;
          

          int result = linearSearchAlgo(arr, n, target);

          if(result == -1){
                System.out.println("Element is not present in array");
          }else{
                System.out.println("Element is present at index: " + result);
          }
           
          
    

    }
    
}
