class Solution {
    public String longestCommonPrefix(String[] strs) {
       String prefix = "";
       boolean match = true;
       for(int i=0;i<strs[0].length();i++){
        char ch = strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(strs[j].length()<=i){
                match = false;
                break;
            }
            char ch2 = strs[j].charAt(i);
            if(ch!=ch2){
                match = false;
                break;
            }
        }
        if(match == false){
            break;
        } else{
            prefix = prefix+ch;
        }
       }
       return prefix;
    }
}