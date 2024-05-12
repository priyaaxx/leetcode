class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String original = "";
        String rev="";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isAlphabetic(ch) || Character.isDigit(ch))
            {
                original = ch + original;
                rev = rev + ch;
            }
        }
        if(rev.equals(original))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}