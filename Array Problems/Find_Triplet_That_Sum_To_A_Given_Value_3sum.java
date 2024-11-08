
// arr = {12, 3, 4, 1, 6, 9};
// int sum = 24;
// Triplet Sum : 12 3 9


// arr = {1, 2, 3, 4, 5};
// int sum = 24;
// Triplet Sum : 1 3 5
// Triplet Sum : 2 3 4

//  arr = {2, 10, 12, 4, 8};
//  int sum = 9;
// Triplet Sum isn't Found


public class Find_Triplet_That_Sum_To_A_Given_Value_3sum{

    static void  triplet3Sum(int[] arr, int n, int sum){

          
          boolean flag = false;
          for(int i=0; i<n; i++){
                for(int j=i+1; j<=n-1; j++){
                      for(int k=j+1; k<n; k++){
                            if(arr[i]+arr[j]+arr[k] == sum){
                                  System.out.println("Triplet Sum : " + arr[i] + " " + arr[j] + " " + arr[k]);
                                  flag = true;
                            }
                      }
                }
          } 
          if(flag != true){
                System.out.println("Triplet Sum isn't Found");
          }   
          
    }



    
    public static void main(String[] args){

      
          // int[] arr = {12, 3, 4, 1, 6, 9};
          // int sum = 24;

          int[] arr = {1, 2, 3, 4, 5};
          int sum = 9;

          // int[] arr = {2, 10, 12, 4, 8};
          // int sum = 9;

          int n = arr.length;

          
          triplet3Sum(arr, n, sum);

          // System.out.println("Find Triplet Sum : " + triplet3Sum(arr, n, sum));
          // printArray(arr, n);
          
          
          

          
    }
}


