
//  String str = "geeks";
//  geeks
//  *kee*
//  **e**

// String str1 = "first" 
// first 
// *sri* 
// **r** 



public class Substring_Reverse_Pattern{

    public static void main(String[] args){
       


        String str = "first";
        char[] s = str.toCharArray();
        int n = s.length;
        System.out.println(str + " "); // str = geeks



        int left = 0;
        int right = n-1;
        //Reverse String
        while(left < right){
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }



        int i = 0;
        int j = n-1;
        while(i < j){
            s[i] = s[j] = '*';
            System.out.println(s);
            i++;
            j--;
        }


    }
}