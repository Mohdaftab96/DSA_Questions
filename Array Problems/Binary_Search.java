


// Enter the Array length : 5
// Enter the Input : 1 2 3 4 5
// Search the Number : 3
// Element is found at index : 2


// Enter the Array length : 4
// Enter the Input : 1 2 3 4
// Search the key Number : 8
// Element is not found



import java.util.Scanner;
public class Binary_Search{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
        //--Binary Search---------
        System.out.print("Enter the Array length : ");
        int n = sc.nextInt();// n = 6
        
        int [] arr = new int[n];
        
        System.out.print("Enter the Input : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt(); // 1 2 3 4 5 6 
        }
        
        System.out.print("Search the Number : ");
        int key = sc.nextInt(); // key = 2
        
        
        int first = 0;
        int last = n - 1;
        int mid = (first + last) / 2;
        
        
        while(first <= last){
            
            if(arr[mid] < key){
                first = mid + 1;
            }
            else if(arr[mid] == key){
                System.out.print("Element found at index : " + mid);
                break;
            }
            else{
                last = mid - 1;
            }

            mid = (first + last) / 2;
            
        }
        
        if(first > last){
            System.out.print("Element is not found ");
        }
        
        
        
        
    }
}
