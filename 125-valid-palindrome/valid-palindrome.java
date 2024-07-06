class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            char char1 = s.charAt(i);
            char char2 = s.charAt(j);
            System.out.println(char1);
            System.out.println(char2);

            if(!(Character.isLetter(char1)|| Character.isDigit(char1))){
                i++;
            } else if(!(Character.isLetter(char2)|| Character.isDigit(char2))){
                j--;
            } else{
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