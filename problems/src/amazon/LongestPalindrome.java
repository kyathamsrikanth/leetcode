package amazon;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int max = 0;
        String sb = "";
        if(s.length() <= 1) return s;
        for(int i = 0 ;i <s.length();i++){
            for(int j= i +1 ; j <s.length() ;j++){
                int k = 0;
                while( (i+k<j-k) && s.charAt(i + k ) == s.charAt(j  - k )) {
                    //length = length + 1 ;
                    k = k+1;

                }
                if(i+k==j-k){
                    if (k*2 +1 > max ){
                        sb =   s.substring(i,j+1);
                        max = k*2 +1;
                    }
                }else {
                    if (k*2 > max ){
                        sb =   s.substring(i,j+1);
                        max = k*2 ;
                    }
                }

            }
        }

        return sb;
    }

    public static void main(String[] args) {
        String result = new LongestPalindrome().longestPalindrome("ccc");
        System.out.println(result);
    }
}
