import java.util.Stack;

/*
Check for balanced parenthesis without using stack
Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, ”}”, ”(“, ”)”, ”[“, ”]” are correct in exp. 
Input : exp = “[()]{}{[()()]()}”
Output : true

Input : exp = “[(])”
Output : false
*/

class BalancedParanthesis {

    public static void main(String[] args) {
        String exp = "[()]{}{[()()]()}{{";
        // exp = "[(])";
        System.out.println(validParanthesis(exp));
    }

    static boolean validParanthesis(String exp) {
        char[] ch = exp.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (Character c : ch) {
            if ((c == ']' || c == ')' || c == '}')) {
                if (stack.empty())
                    return false;
                else {
                    char popped = stack.pop();
                    if ((popped == '[' && c == ']'))
                        continue;
                    else if ((popped == '{' && c == '}'))
                        continue;
                    else if ((popped == '(' && c == ')'))
                        continue;
                    else
                        return false;
                }
            } else {
                stack.push(c);
            }
        }
        return (stack.isEmpty());

    }

}