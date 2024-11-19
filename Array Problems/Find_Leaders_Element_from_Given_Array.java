
        
// int[] arr = {16, 17, 4, 3, 5, 2};
// Leader element are : 17 5 2


// int[] arr = {1, 2, 3, 4, 5, 2};
// // Leader element are : 5 2

// int[] arr = {1, 2, 3, 4, 5, 6, 0};
// // Leader element are : 6 0



public class Find_Leaders_Element_from_Given_Array {

    static void findLeaderElement(int[] arr){

          int n = arr.length;

          int j;
          
          for(int i=0; i<n; i++){
                for(j=i+1; j<=n-1; j++){
                      if(arr[i] <= arr[j]){
                            break;
                      }
                }
                if(j == n){
                      System.out.print(arr[i] + " ");
                }
          }
          
    }
    
    public static void main(String[] args){

          
          // int[] arr = {16, 17, 4, 3, 5, 2};
          int[] arr = {1, 2, 3, 4, 5, 2};
          findLeaderElement(arr);
          

          
    }
}


        


   

