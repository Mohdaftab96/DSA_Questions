

// int[] arr = {1, 2, 3, 2, 3, 4};
// after Removing dublicate element : 1 2 3 4

// int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
// after Removing dublicate element : 1 2 5 7 4 

// int[] arr = {1, 4, 5, 2, 4, 2, 6, 7, 6};
// after Removing dublicate element : 1 4 5 2 6 7




public class Remove_Duplicate_Element{

      static void findDublicateElements(int[] arr){

            int n = arr.length;

            int j;
            for(int i=0; i<n; i++){
                  for(j=0; j<i; j++){
                        if(arr[i] == arr[j]){
                              break;
                        }
                  }
                  if(i == j){
                        System.out.print(arr[i] + " ");
                  }
            }      
      }
    
      public static void main(String[] args){

          
            // int[] arr = {1, 2, 3, 2, 3, 4};
            // int[] arr = {1, 2, 5, 1, 7, 2, 4, 2};
            int[] arr = {1, 4, 5, 2, 4, 2, 6, 7, 6};
            findDublicateElements(arr);
          

          
    }
}


    