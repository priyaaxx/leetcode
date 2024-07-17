class Solution {
    public String longestPalindrome(String s) {
        String res="";
        int maxLen = 0;
        
        for(int i=0;i<s.length();i++){
            //odd length
            int l=i;
            int r=i;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > maxLen){
                    res = s.substring(l, r+1);
                    maxLen = res.length();
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                if((r-l+1) > maxLen){
                    res = s.substring(l, r+1);
                    maxLen = res.length();
                }
                l--;
                r++;
            }
        }
        return res;
    }
}