class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>= 97 && ch<=122) || (ch>=48 && ch<=57)){
                str = str+ch;
            }
        }

        int a = 0;
        int b = str.length()-1;

        while(a<b){
            if(str.charAt(a) == str.charAt(b)){
                a++;
                b--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}