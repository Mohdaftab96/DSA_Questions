
// String str = xyaabax  (Range1 : (3, 5)) 
// 4

// String str = xyaabax  (Range2 = (2, 3)) 
// 3


public class Count_of_Palindromic_Substrings_in_an_Index_Range{

      static boolean isPal(String s){
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

    static int countPSIndexRange(String str, int l, int r){

      String subStr1 = str.substring(l, r+1); // aba
      int n = subStr1.length(); // 3


      int count = 0;
      String subStr2 = "";
      for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                  subStr2 = subStr1.substring(i, j);
                  if(isPal(subStr2)){
                      count++;
                  }
            }
      }

            return count;
      }

      public static void main(String[] args){
      //      String str = "xyaabax";
      //      int l = 3;
      //      int r = 5;

           String str = "xyaabax";
           int l = 2;
           int r = 3;

//        countPSIndexRange(str, l, r);

      System.out.println(countPSIndexRange(str, l, r));



    }
}