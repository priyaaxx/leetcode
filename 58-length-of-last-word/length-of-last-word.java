class Solution {
    public int lengthOfLastWord(String s) {
        String word ="";
        int len=0;
        s=s.trim();
        if(!s.contains(" ")){
            s= " " + s;

        } 
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            System.out.println(ch);
            if(ch == ' '){
                len = word.length();
                return len;
            } else{
                word = ch + word;
            }
        }
        return len;
    }
}