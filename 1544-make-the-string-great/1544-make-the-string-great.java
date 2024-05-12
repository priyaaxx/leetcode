class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(!st.isEmpty() && Math.abs(st.peek()-s.charAt(i))==32)
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        
        char charArr[] = new char[st.size()];
        int idx = st.size() - 1;
        
        while(!st.isEmpty())
        {
            charArr[idx] = st.pop();
            idx--;
        }
       
        return new String(charArr);
    }
}