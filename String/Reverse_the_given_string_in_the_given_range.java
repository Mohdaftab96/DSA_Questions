


// Input: str = "geeksforgeeks", L = 5, R = 7
// Output: geeksrofgeeks


// Input: str = "ijklmn", L = 1, R = 2
// Output: ikjlmn

public class Reverse_the_given_string_in_the_given_range {
      public static void main(String[] args){
  
          String str = "ikjlmn";
          char[] arr = str.toCharArray();
          int n = str.length();
          char temp;
  
  
          // left n right given
          int left = 1;
          int right = 2;
              while(left < right){
                  temp = arr[left];
                  arr[left] = arr[right];
                  arr[right] = temp;
  
                  left++;
                  right--;
              }
  
          String s = String.valueOf(arr); // converting char to string
          System.out.print("Reverse String with Given Range : " + s);
  
  
  
  
      }
  }