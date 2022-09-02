package amazon;


import java.util.HashSet;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {

        int i = 0 ;
        int j = 0 ;
        int max = 0 ;
        if (s.length() == 0 ) return 0;
        if (s.length() == 1) return 1;
        HashSet<Character> set  = new HashSet<Character>();

        while (i<=j && j<s.length()){
            int length = 0;
            if(set.contains(s.charAt(j))){
                length = j-i;
                set.remove(s.charAt(i));
                max = Math.max(length,max);
                i=i+1;
            }else{
                set.add(s.charAt(j));
                j=j+1;
            }

        }
        max = Math.max( j-i,max);
        return max;

    }
    public static void main(String[] args) {
        int result = new LengthOfLongestSubstring().lengthOfLongestSubstring("pwwkem");
        System.out.println(result);
    }
}
