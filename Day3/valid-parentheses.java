class Solution {
    public boolean isValid(String s) {
        int top = -1;
        char[] stack = new char[s.length()];
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i)== '(' || s.charAt(i)== '{' || s.charAt(i) == '[')
                stack[++top] = s.charAt(i);
            else {
                if (top>= 0 && ((stack[top] == '(' && s.charAt(i)== ')')
                        || (stack[top] == '{' && s.charAt(i) == '}')
                        || (stack[top] == '[' && s.charAt(i) == ']')))
                    top--;
                else 
                    return false;
            }
        }
        if(top == -1)
        return true;
    return false;
    }
}
