package HW.sort;

public class Palindrome {
    public int getLongestPalindrome(String A, int n) {
        int maxLen = 0;
        //暴力解法
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                String now = A.substring(i,j);
                if(isPalindrome(now) && now.length() > maxLen){
                    maxLen = now.length();
                }
            }
        }
        return maxLen;
    }

    //判断子串是不是回文子串
    public boolean isPalindrome(String s){
        int l = s.length();
        for(int i = 0; i < l/2; i++){
            if(s.charAt(i) != s.charAt(l-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome palindrome =  new Palindrome();
        String str="abc1234321ab";
        int longestPalindrome = palindrome.getLongestPalindrome(str, 12);
        System.out.println(longestPalindrome);
    }
}
