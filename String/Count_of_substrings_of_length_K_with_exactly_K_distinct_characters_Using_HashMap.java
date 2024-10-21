

// Enter the String : aabab
// Enter the k length : 3
// Count of substrings of length K with exactly K distinct characters is : 0

// Enter the String : abcc
// Enter the k length : 2
// Count of substrings of length K with exactly K distinct characters is : 2

// {a=1, b=1} 
// {b=1, c=1} 
// {c=2} 


import java.util.HashMap;

public class Count_of_substrings_of_length_K_with_exactly_K_distinct_characters_Using_HashMap {

      static int count = 0;

      static int countSubstring(String str, int k){
            int n = str.length();

            for(int i=0; i<n-k+1; i++){
                  String s = str.substring(i, i+k); // ab bc cc are substring

                  HashMap<Character, Integer> map = new HashMap<>();

                  for(char c: s.toCharArray()){
                        map.put(c, map.getOrDefault(c, 0) + 1);
                  }

                  if(map.size() == k ){
                        count = count + 1;
                  }
            }
            return count;
      }



      public static void main(String[] args){
            
            String str = "aabab";

            int k = 3;

            // countSubstring(str, k);

            System.out.print("Count of substrings of length K with exactly K distinct characters is : " + countSubstring(str, k));
      }
}
