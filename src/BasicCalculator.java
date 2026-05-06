import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int dimString = s.length();
        int i = 0;

        while (i < dimString) {
            if (s.charAt(i) == '+') {
                stack.push(Integer.parseInt(String.valueOf(s.charAt(i + 1))));
                i = i + 2;
            } else if (s.charAt(i) == '-') {
                stack.push(-Integer.parseInt(String.valueOf(s.charAt(i + 1))));
                i = i + 2;
            } else if (s.charAt(i) == '*') {
                int oldHead = stack.pop();
                int newHead = oldHead * Integer.parseInt(String.valueOf(s.charAt(i + 1)));
                stack.push(newHead);
                i = i + 2;
            } else if (s.charAt(i) == '/') {
                int oldHead = stack.pop();
                int newHead = oldHead / Integer.parseInt(String.valueOf(s.charAt(i + 1)));
                stack.push(newHead);
                i = i + 2;
            } else {
                stack.push(Integer.parseInt(String.valueOf(s.charAt(i + 1))));
                i++;
            }
        }

        int risultato = 0;
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            risultato = risultato + temp;
        }
        return risultato;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        BasicCalculator solver = new BasicCalculator();
        String s1 = "5-1+2*4";
        String s2 = "8-5/5+9-1+4/2";
        int risultato1 = solver.calculate(s1);
        int risultato2 = solver.calculate(s2);

        System.out.println("Il risultato della prima espressione aritmetica è " + risultato1);
        System.out.println("Il risultato della seconda espressione aritemtica è " + risultato2);
    }
}
