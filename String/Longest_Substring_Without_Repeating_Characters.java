

// Input: "ABCBC"
// Output: Longest substring without repeating characters is : 3
// Explanation: The longest substring without repeating characters is "ABC"

// Input: "GEEKSFORGEEKS"
// Output: Longest substring without repeating characters is : 7

//===================Method - 01=====================

import java.util.HashSet;
public class Longest_Substring_Without_Repeating_Characters{

    static int longestUniqueSubstr(String str, int n){


        HashSet<Character> hash = new HashSet<>();
        String subStr = "";
        int maxCount = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                subStr = str.substring(i, j);
                int n1 = subStr.length();


                    for(int k=0; k<n1; k++){
                        if(!hash.contains(subStr.charAt(k))){
                            hash.add(subStr.charAt(k));
                        }
                    }
                if(hash.size() > maxCount){
//                    System.out.println(hash);
                    maxCount = hash.size();
                }
            }
        }

        return maxCount;


    }

        public static void main(String[] args) {

            String str = "ABCBC";
            int n = str.length();


//            longestUniqueSubstr(str, n);
            System.out.println("MaxiMum Length of Non-repeating Character : " + longestUniqueSubstr(str, n));


        }
}



//=================== Method - 02 =====================

/*
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

 */
