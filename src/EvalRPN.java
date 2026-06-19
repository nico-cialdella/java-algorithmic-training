import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();
        int i = 0;
        int length = tokens.length;
        int temp;

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

        int result_arr_1 = test.evalRPN(arr_1);
        int result_arr_2 = test.evalRPN(arr_2);
        int result_arr_3 = test.evalRPN(arr_3);

        System.out.println("Result for arr_1: " + result_arr_1);
        System.out.println("Result for arr_2: " + result_arr_2);
        System.out.println("Result for arr_3: " + result_arr_3);
    }
}
