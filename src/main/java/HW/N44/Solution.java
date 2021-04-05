package HW.N44;

public class Solution {
    public boolean isMatch(String s, String p) {
        if(s == null || p == null){
            return false;
        }
        int m = s.length();
        int n = p.length();
        int i = 0,j = 0, backI = -1,backJ = -1;
        while(i< m){
            if(j < n && (s.charAt(i)== p.charAt(j) || p.charAt(j)=='?')){
                i++;
                j++;
            }else if(j < n && p.charAt(j)=='*'){
                backI = i;
                backJ = j++;
            }else if(backJ != -1){
                i = backI + 1;
                j = backJ + 1;
                backI = i;
            }else{
                return false;
            }
        }
        while(j < n  && p.charAt(j)=='*'){
            j++;
        }
        return j == n;
    }

    public static void main(String[] args) {
        String s="";
        String p ="*";
        Solution solution = new Solution();
        boolean match = solution.isMatch(s, p);
        System.out.println(match);
    }
}
