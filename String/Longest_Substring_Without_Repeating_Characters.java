

// Input: "ABCBC"
// Output: Longest substring without repeating characters is : 3
// Explanation: The longest substring without repeating characters is "ABC"

// Input: "GEEKSFORGEEKS"
// Output: Longest substring without repeating characters is : 7



import java.util.HashSet;
public class Longest_Substring_Without_Repeating_Characters {

    static int longestUniqueSubstr(String str, int n){

        HashSet<Character> hs = new HashSet<Character>();
      
        
        for(int i=0; i<n; i++){
            if(!hs.contains(str.charAt(i))){
                hs.add(str.charAt(i));
            }
        }
        return hs.size();
    }

    public static void main(String[] args){

        String str = "GEEKSFORGEEKS";
        int n = str.length();
//        longestUniqueSubstr(s, n);

        System.out.println("Longest substring without repeating characters is : " + longestUniqueSubstr(str, n));


    }
}
