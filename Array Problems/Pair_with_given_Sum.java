
// int[] arr = {1, 2, 4, 5, 8, 10, 11};
// int target = 13;
// True

// int[] arr = { 0, -1, 2, -3, 1 };
// int target = -2;
// True

// int[] arr = {1, -2, 1, 0, 5};
// int target = 0;
// False



public class Pair_with_given_Sum{

    static boolean pairWithGivenSum(int[] arr, int n, int target){
          

          for(int i=0; i<n; i++){
                for(int j=i+1; j<=n-1; j++){
                      if(arr[i] + arr[j] == target){
                            return true;
                      }
                }
          } 
          return false;
    }

    public static void main(String[] args){

          // int[] arr = {1, 2, 4, 5, 8, 10, 11};
          // int target = 13;

          // int[] arr = { 0, -1, 2, -3, 1 };
          // int target = -2;

          int[] arr = {1, -2, 1, 0, 5};
          int target = 0;

          int n = arr.length;


          // pairWithGivenSum(arr, n, target);
          if(pairWithGivenSum(arr, n, target)){
                System.out.println("True");
          }else{
                System.out.println("False");
          }   
          
          

    }
    
}
