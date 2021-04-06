package HW.NC17;

public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here

        char[] ch  = A.toCharArray();
        int res = 0;
        for (int i = 0; i < n; i++){
            int l = i;
            int r = i;
            int sameR = i;
            //定位左右两边，避免abba
            while (l-1 >= 0 && ch[l -1] == ch[i]){
                l--;
            }
            while (r + 1 < n && ch[r+1] == ch[i]){
                r++;
            }
            sameR = r;
            while (l-1 >= 0 && r + 1 < n && ch[l -1] == ch[r+1]){
                l--;
                r++;
            }
            res = Math.max(res, r-l+1);

            //优化
            i = sameR;
        }
        return  res;
    }

    public static void main(String[] args) {
        String str ="abc1234321ab";
        int  count = 12;
        Solution solution = new Solution();
        int longestPalindrome = solution.getLongestPalindrome1(str, count);
        System.out.println(longestPalindrome);
    }

    public int getLongestPalindrome1(String A, int n) {
        int maxLen = 0;

        //暴力解法
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j <= n ; j++) {
                String now  = A.substring(i ,j);
                if(isPalindrome(now) && now.length()> maxLen){
                    maxLen = now.length();
                }
            }
        }
        return maxLen;
    }

    public  Boolean isPalindrome(String s){
        int l = s.length();
        for (int i = 0; i < l/2; i++) {
            if(s.charAt(i) !=s.charAt(l-i-1)){
                return  false;
            }
        }

        return  true;
    }
}
