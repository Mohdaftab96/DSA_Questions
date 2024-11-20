

// int[] arr = {15, 18, 2, 3, 6, 12};
// Rotation Count in a Rotated Sorted array : 2

// int[] arr = {7, 9, 11, 12, 5};
// Rotation Count in a Rotated Sorted array : 4

// int[] arr = {7, 9, 11, 12, 15};
// Rotation Count is not found in a Sorted array



public class Rotation_Count_In_Rotated_Sorted_Array{

      static int rotatedCount(int[] arr, int n){
            int min = arr[0], min_index = 0;
            for(int i=0; i<n; i++){
                  if(min > arr[i]){
                       min = arr[i];
                       min_index = i;
                  }
            }
            return min_index;   
      }


    public static void main(String[] args){

          

          // int[] arr = {15, 18, 2, 3, 6, 12};
          // int[] arr = {7, 9, 11, 12, 5};
          int[] arr = {7, 9, 11, 12, 15};
          int n = arr.length;
          

          int minIndex = rotatedCount(arr, n);

          if(minIndex == 0){
                System.out.println("Rotation Count is not found");
          }else{
                System.out.println("Rotation Count in a Rotated Sorted array : " + minIndex);
          }
          
    

    }
    
}






