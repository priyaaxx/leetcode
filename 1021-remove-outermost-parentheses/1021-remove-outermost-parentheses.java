class Solution {
    public String removeOuterParentheses(String s) {
        Stack stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (stack.isEmpty() && c == '(') {
        stack.push(c);
        continue;
      }
      if (stack.size() == 1 && c == ')') {
        stack.pop();
        continue;
      }
      if (c == '(') {
        stack.push(c);
      }
      else {
        stack.pop();
      }
      sb.append(c);
    }
    return sb.toString();
    }
}