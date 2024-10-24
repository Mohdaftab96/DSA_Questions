

// Count number of distinct substrings of a given length
// Input : s = "abcbab", l = 2 
// Output : 4 
// All distinct sub-strings of length 2 
// will be {"ab", "bc", "cb", "ba"} 
// Thus, answer equals 4. 


// Input : s = "ababa", l = 2 
// Output : 2 



import java.util.HashSet;
public class Count_number_of_distinct_substrings_of_a_given_length_GitHub {

      static int countNumberOfDistinctSubstring(String str, int k){

            HashSet<String> hash = new HashSet<>();
            int n = str.length();
            String subStr = "";
            for(int i=0; i<n-k+1; i++){
                  subStr = str.substring(i, i+k); // finding Substring of Given String
                  if(!hash.contains(subStr)){ //Searching in map ab, ba, ab, ba 
                        hash.add(subStr);
                  }     
            }
            return hash.size();
      }

      public static void main(String[] args){
            String str = "ababa";
            int k = 2; // this length of String We have to Find out

            // countNumberOfDistinctSubstring(str, k);

            System.out.println("Count number of distinct substrings with Given Length : " + countNumberOfDistinctSubstring(str, k));

      }
}



