
//---Majority Element----


//-----------Simple Input--------------------
// Enter the Array length : 9
// Enter the Input : 3 3 4 2 4 4 2 4 4
// 4 is in Majority 5


// Enter the Array length : 8
// Enter the Input : 4 5 5 4 5 5 4 5
// 5 is in Majority 5


// Enter the Array length : 8
// Enter the Input : 3 3 4 2 4 4 2 4
// Majority is not Found 


// Time Complexity : O(n^2)
//===Method - 01=====

import java.util.Scanner;
public class Majority_Element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Array length : ");
        int n = sc.nextInt(); // n = 10
        
        int [] arr = new int[n];
        
        System.out.print("Enter the Input : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); // 1 1 0 0 2 0 1 2 1 0
        }
       
        // int count = 0;
        int maxCount = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count = count + 1;
                    
                }

                if(count > maxCount){
                    maxCount = count;
                    index = i;
                   
                }
            }
        }

        if(maxCount > (n/2)){
            System.out.println(arr[index] + " is in Majority " + maxCount);
        }else{
            System.out.println("Majority is not Found ");
        }



    }
}



//=====Method - 02====

/*
 
import java.util.Scanner;
public class Majority_Element{
            public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the Array Length : ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter the Array Elements : ");
            for(int i=0; i<n; i++){
                  arr[i] = sc.nextInt();
            }


            boolean flag = false;
            int k = n/2;
            for(int i=0; i<n; i++){
                  int count = 1;
                  for(int j=0; j<i; j++){
                        if(arr[i] == arr[j]){
                              count = count + 1;
                        }
                  }
                  if(count > k){
                        System.out.print("Majority Elements is : " + arr[i]);
                        flag = true;
                  }
            }

            if(flag == false){
                  System.out.print("Majority Element is not Found");
            }

     

            
      }
}




 */