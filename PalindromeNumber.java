public class PalindromeNumber {

    public boolean isPalindrome(int number) {
        int i;
        int j;
        boolean equal;

        String convertedNumber = String.valueOf(number);
        int size = convertedNumber.length();

        i = 0;
        j = size - 1;
        equal = true;

        while (i < j && equal == true) {
            if (convertedNumber.charAt(i) == convertedNumber.charAt(j)) {
                equal = true;
            } else {
                equal = false;
            }
            i++;
            j--;
        }
        
        return equal;
    }


    public static void main(String[] args) throws Exception {
        int firstNumber = 121;
        int secondNumber = 341;
        PalindromeNumber solver = new PalindromeNumber();
        boolean firstNumberCheck = solver.isPalindrome(firstNumber);
        boolean secondNumberCheck = solver.isPalindrome(secondNumber);

        System.out.println(firstNumber + " è palindromo? " + firstNumberCheck);
        System.out.println(secondNumber + " è palindromo? " + secondNumberCheck);
    }
}

