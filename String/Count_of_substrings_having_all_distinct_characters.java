

// Input: Str = “gffg”
// Output: 6 (g, gf, f, f, fg, g)
// Explanation:
// All possible substrings from the given string are,
// ( "g", "gf", "gff", "gffg", "f",  "f", "fg", "g")


// String str = "gfg";
// Output: 6 (g, gf, f, fg, g)



public class Count_of_substrings_having_all_distinct_characters{

        static boolean isPalindrome(String s){
  
            int n1 = s.length();
  
            for(int i=0; i<n1; i++){
                for(int j=i+1; j<n1; j++){
                    if(s.charAt(i) == s.charAt(j)){
                        return false;
                    }
                }
            }
            return true;
      }
  
  
        static int countOfSubstringsHavingAllDistinctCharacters(String str, int n){
  
  
            String sum = "";
            int count = 0;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<=n; j++){
                    sum = str.substring(i, j);
  //                System.out.print(sum + " ");
                        if(isPalindrome(sum)){
                            count = count + 1;
                            System.out.print(sum + " "); // g gf f fg g
  
                        }
                    }
  
                }
          return count;
      }
  
      //Driver Code
      public static void main(String[] args){
  
            String str = "gfg";
            int n = str.length();
  
  //        countOfSubstringsHavingAllDistinctCharacters(str, n);
  
          System.out.println("Count of Distinct Character : " + countOfSubstringsHavingAllDistinctCharacters(str, n));
  
  
  
      }
  }
  
