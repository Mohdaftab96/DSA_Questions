

// String str = "geeksforgeeks";
// int k = 3; // Given
// Smallest Substring is : eek
// Largest Substring is : sfo

// String str = "GeeksForGeeks";
// int k = 3; // Given
// Smallest Substring is : For
// Largest Substring is : sFo

// String str = "GeeksForGeeks";
// int k = 2; // Given
// Smallest Substring is : el
// Largest Substring is : lo

// =============Time Complexity : O(n)====================



public class  Lexicographically_smallest_and_largest_substring_of_size_k{

    static void findLargestAndSmallestElement(String s, int k){
        String currstr = s.substring(0 , k);
        String lenMax = currstr; // he
        String lenMin = currstr; // he


        int n = s.length();
        for(int i=1; i<=n-k; i++){
            currstr = s.substring(i, i+k);
            if(lenMax.compareTo(currstr) < 0){
                lenMax = currstr;
            }
            if(lenMin.compareTo(currstr) > 0){
                lenMin = currstr;
            }
        }

        System.out.println("Smallest Substring : " + lenMin);
        System.out.println("Largest Substring : " + lenMax);
    }


    public static void main(String[] args){
        String s = "hello";
        int k = 2;

        findLargestAndSmallestElement(s, k);


    }
}


