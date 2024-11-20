


// arr = { 1, 2, 4, 6, 10, 12, 14 };
// target = 7;
// Floor of 7 is 6

// arr = {1, 2, 8, 10, 10, 12, 19};
// target = 0;
// Floor of 0 doesn't exist in array 

// arr = {1, 2, 8, 10, 10, 12, 19};
// target = 20;
// Floor of 20 is 19

// arr = {1, 2, 8, 10, 10, 12, 19};
// target = 5;
// Floor of 5 is 2



public class Floor_in_a_Sorted_Array{

      static int floorSearch(int[] arr, int n, int target){
   
            int x = -1;
            for(int i=0; i<n; i++){
                  if(target > arr[i]) {
                        x = arr[i];
                  }  
            }
            return x;
                  
      }


      public static void main(String[] args){

            

            int[] arr = {1, 2, 8, 10, 10, 12, 19};
            int target = 5;

            // int[] arr = {1, 2, 8, 10, 10, 12, 19};
            // int target = 20;

            // int[] arr = {1, 2, 8, 10, 10, 12, 19};
            // int target = 0;

            // int[] arr = { 1, 2, 4, 6, 10, 12, 14 };
            // int target = 7;
            int n = arr.length;
            

            int index = floorSearch(arr, n, target);

            if(index == -1){
                  System.out.println("Floor of " + target
							+ " doesn't exist in array ");
            }else{
                  System.out.println("Floor of " + target + " is "
							+ index);
            }
             
      
      }
      
}

