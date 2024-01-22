import java.util.Stack;

class q20 {
    public boolean isValid(String s) {
        char[] ar = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : ar) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {return false;}
                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

