class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub = s.substring(i,j);
                if(isPal(sub)){
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPal(String sub){
        int n=sub.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            char A = sub.charAt(i);
            char B = sub.charAt(j);
            if(A != B){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}