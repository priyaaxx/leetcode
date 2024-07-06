class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int arrS[] = new int[26];
        int arrT[] = new int[26];
        for(int i=0;i<s.length();i++){
            char chS= s.charAt(i);
            arrS[chS - 'a']++;
            char chT = t.charAt(i);
            arrT[chT - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(arrS[i]!=arrT[i]){
                return false;
            }
        }
        return true;
    }
}