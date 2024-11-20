

// int[] arr = {5, 20, 3, 2, 50, 80}
// diff = 78
// Pair Found: (2, 80)


// arr = { 1, 8, 30, 40, 100}
// diff = 60;
// Pair Found: (40, 100)

// arr = {90, 70, 20, 80, 50};
// diff = 45;
// No Pair Found


public class Find_Pair_of_Element_Given_Difference{

    static void findPair(int[] arr, int n, int diff){

          for(int i=0; i<n; i++){
                for(int j=i+1; j<=n-1; j++){
                      if(arr[j]-arr[i] == diff){
                            System.out.println("Pair Found: (" + arr[i] + ", " + arr[j] + ")");
                            return;
                      }
                }
          }
          System.out.println("No Pair Found");;
    }

    public static void main(String[] args){

          // int[] arr = {5, 20, 3, 2, 50, 80};
          // int diff = 78;

          // int[] arr = { 1, 8, 30, 40, 100};
          // int diff = 60;

          int[] arr = {90, 70, 20, 80, 50};
          int diff = 45;



          int n = arr.length;

         findPair(arr, n, diff);
          

    }
    
}
