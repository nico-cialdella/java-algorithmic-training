import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();
        int stringLength = s.length();
        int i = 0;

        while (i < stringLength) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                openBrackets.push(s.charAt(i));
            }
            else if (openBrackets.isEmpty()) {
                return false;
            }
            else {
                if ((s.charAt(i) == ')' && openBrackets.peek() == '(') || (s.charAt(i) == ']' && openBrackets.peek() == '[') || (s.charAt(i) == '}' && openBrackets.peek() == '{')) {
                    openBrackets.pop();
                }
                else {
                    return false;
                }
            }
            i++;
        }
        if (openBrackets.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        ValidParentheses test = new ValidParentheses();
        boolean test1 = test.isValid("([])");
        boolean test2 = test.isValid("([)]");
        boolean test3 = test.isValid("()[]{}");

        System.out.print("Is the first string valid? ==> "); // Expected Output: Yes
        if (test1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print("Is the second string valid? ==> "); // Expected Output: No
        if (test2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println("Is the third string valid? ==> "); // Expected Output: Yes
        if (test3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
