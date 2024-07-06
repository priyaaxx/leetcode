class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            int char1 = s.charAt(i);
            int char2 = s.charAt(j);
            System.out.println(char1);
            System.out.println(char2);

            if(!(Character.isLetter(char1)|| Character.isDigit(char1))){
                i++;
            } else if(!(Character.isLetter(char2)|| Character.isDigit(char2))){
                j--;
            } else{
                if(char1>='a' && char1<='z'){
                    char1 = char1 - (int)'a';
                }
                if(char2>='a' && char2<='z'){
                    char2 = char2 - (int)'a';
                }
                if(char1 == char2){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
        }
       return true;
    }
}