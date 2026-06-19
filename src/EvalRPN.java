import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        int i = 0;
        int length = tokens.length;
        int temp;

        /* The logic I used to solve this problem is the following: 
        for each element of the array, I check if it is a number or an operator.
        If it's a number, I push it onto the stack.
        Else, I pop the top two numbers from the stack, execute the operation between them, and save the temporary result by pushing it back onto the stack.
        It's important to push the temporary result at each iteration, so I can make calculations step by step.
        This way, I arrive at the end with a unique value left on the stack, which represents the final result.
        */

        while (i < length) {
            try {
                int number = Integer.parseInt(tokens[i]);
                numbers.push(number);

            } catch (NumberFormatException e) {
                char operator = tokens[i].charAt(0);

                switch (operator) {
                    case '+':
                        int firstAddend = numbers.pop();
                        int secondAddend = numbers.pop();
                        temp = secondAddend + firstAddend;
                        numbers.push(temp);
                        break;
                    
                    case '-':
                        int firstNumber = numbers.pop();
                        int secondNumber = numbers.pop();
                        temp = secondNumber - firstNumber;
                        numbers.push(temp);
                        break;

                    case '*':
                        int firstFactor = numbers.pop();
                        int secondFactor = numbers.pop();
                        temp = secondFactor * firstFactor;
                        numbers.push(temp);
                        break;

                    case '/':
                        int firstNum = numbers.pop();
                        int secondNum = numbers.pop();
                        temp = secondNum / firstNum;
                        numbers.push(temp);
                        break;
                }
            }
            i++;
        }
        return numbers.pop();
    }

    public static void main(String[] args) {
        // Test cases
        EvalRPN test = new EvalRPN();
        String[] arr_1 = {"2","1","+","3","*"};
        String[] arr_2 = {"4","13","5","/","+"};
        String[] arr_3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int result_arr_1 = test.evalRPN(arr_1); // Expected Output: 9
        int result_arr_2 = test.evalRPN(arr_2); // Expected Output: 6
        int result_arr_3 = test.evalRPN(arr_3); // Expected Output: 22

        System.out.println("Result for arr_1: " + result_arr_1);
        System.out.println("Result for arr_2: " + result_arr_2);
        System.out.println("Result for arr_3: " + result_arr_3);
    }
}
