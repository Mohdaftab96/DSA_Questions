
// Enter the String : "1234";
// Number of even substrings  in a string of digits : 6


// Enter the String : "154";
// Number of even substrings  in a string of digits : 3





public class Number_of_even_substrings_in_a_string_of_digits{

    static int evenNumSubstring(String str,int n){

        String subStr = "";
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                subStr = str.substring(i, j); // 1, 12, 123, 1234, 2, 23, 234, 3, 34, 4
                int n1 = subStr.length();

                if(subStr.charAt(n1-1)%2 == 0){
                    count = count + 1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "154";
        int n = str.length();

//        evenNumSubstring(str, n);

        System.out.println("Number of even substrings  in a string of digits : " + evenNumSubstring(str, n));
//
    }
}
