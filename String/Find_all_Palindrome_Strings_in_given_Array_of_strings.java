

// Enter the Array String : 5
// Enter the Array String Values : abd abc adaa racecarr cool
//  -1 (No palindromic String Given in the String Array)

// Enter the Array String : 5
// Enter the Array String Values : abc car ada racecar cool
// ada racecar



import java.util.ArrayList;

public class Find_all_Palindrome_Strings_in_given_Array_of_strings {

    public static boolean isPalindrom(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static ArrayList<String> palindromicString(String[] arr, int n){

        ArrayList<String> ans = new ArrayList<String>();
        for(int i = 0; i<n; i++){
            if(isPalindrom(arr[i])){
                ans.add(arr[i]);
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        String[] arr = {"abc", "car", "ada", "racecar", "cool"};
        int n = arr.length;

        ArrayList<String> s = palindromicString(arr, n);

        if(s.size() == 0){
            System.out.print("-1");
        }

        for(String st : s){
            System.out.print(st + " ");
        }


    }
}
