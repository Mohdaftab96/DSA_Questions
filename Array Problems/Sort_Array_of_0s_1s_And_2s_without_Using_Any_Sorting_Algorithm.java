
//---Sort an array of 0s, 1s and 2s,Without Using Any Sorting Algorithm (Dutch National Flag problem)----


//-----------Simple Input--------------------
// Enter the Array length : 10
// Enter the Input : 1 1 0 0 2 0 1 2 1 0
// 0 0 0 0 1 1 1 1 2 2


//-----------Simple Input--------------------
// Enter the Array length : 12
// Enter the Input : 0 1 2 2 1 0 0 2 0 1 1 0
// 0 0 0 0 0 1 1 1 1 2 2 2

// Time Complexity : O(n)



import java.util.Scanner;
public class Sort_Array_of_0s_1s_And_2s_without_Using_Any_Sorting_Algorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Array length : ");
        int n = sc.nextInt(); // n = 10
        
        int [] arr = new int[n];
        
        System.out.print("Enter the Input : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); // 1 1 0 0 2 0 1 2 1 0
        }
        

        int one = 0;
        int two = 0;
        int third = 0;

        for(int i=0; i<n; i++){

            if(arr[i] == 0){
                one++; // one
            }

            if(arr[i] == 1){
                two++;
            }


            if(arr[i] == 2){
                third++;
            }
        }



        for(int i=0; i<one; i++){
            arr[i] = 0;
        }


        for(int i=one; i<two+one; i++){
            arr[i] = 1;
        }


        for(int i=two+one; i<n; i++){
            arr[i] = 2;
        }



         for(int i=0; i<n; i++){
            System.out.print(arr[i] + " "); // outpur will be : 0 0 0 0 1 1 1 1 2 2
        }


        
    }
}




//=================Another Method============================


/*
 
import java.util.Scanner;
public class Sort_Array_of_0s_1s_And_2s_without_Using_Any_Sorting_Algorithm {
            public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Array Length : ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
            }


            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            

            for(int i=0; i<n; i++){
                  if(arr[i] == 0){
                        count1++; // 2
                  }
            
                  if(arr[i] == 1){
                        count2++; // 2
                  }
                  
                  if(arr[i] == 2){
                        count3++; // 2
                  }
                  
            }


            int i=0;

            while(count1 > 0){
                  arr[i++] = 0;
                  count1--;
            }


            while(count2 > 0){
                  arr[i++] = 1;
                  count2--;
            }

            while(count3 > 0){
                  arr[i++] = 2;
                  count3--;
            }


            for(i=0; i<n; i++){
                  System.out.print(arr[i] + " ");
            }
            

           
       
            
      }
}



 */
