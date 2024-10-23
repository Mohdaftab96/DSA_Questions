

// String str = "04"
// Number of substrings divisible by 4 in a string of integers : 3


// String str = "124"
// Number of substrings divisible by 4 in a string of integers : 4


public class Number_of_substrings_divisible_by_Four_in_a_string_of_integers_GitHub{
      static int countDivisibleby4(String str,int n){
  
          String sum = "";
          int count = 0;
          for(int i=0; i<n; i++){
              for(int j=i+1; j<=n; j++){
                  sum = str.substring(i, j); // 1, 12, 124, 2, 24, 4
                  int n1 = Integer.parseInt(sum); // converting String to Integer
  
                  if(n1 % 4 == 0){
                      count = count + 1;
                  }
              }
          }
          return count;
      }
  
      public static void main(String[] args) {
          String str = "04";
          int n = str.length();
  
  //        countDivisibleby4(str, n);
  
          System.out.println("Number of substrings divisible by 4 in a string of integers : " + countDivisibleby4(str, n));
  //
      }
  }