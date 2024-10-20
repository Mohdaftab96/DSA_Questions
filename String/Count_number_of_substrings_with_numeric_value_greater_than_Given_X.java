

// Enter the String : 471
// Enter the X value : 47
// numeric value greater than X is : 2


// Enter the String : 2222
// Enter the X value : 97
// numeric value greater than X is : 3


public class Count_number_of_substrings_with_numeric_value_greater_than_Given_X{

    static int count(String str, int x){

        int n = str.length();
        String sum = "";
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                sum = str.substring(i, j);
                int n1 = Integer.parseInt(sum);
                if(n1 > x){
                    count = count + 1;
                }
            }
        }
        return count;
    }


    public static void main(String[] args){

        String str = "2222";
        int x = 97;

        // count(str, x);
        System.out.println(count(str, x));

    }
}