
public class PalindromeNumber {

    public boolean isPalindrome(int number) {
        int i;
        int j;
        boolean equal;

        /* Converting the number to a string allows me to use the Two Pointers technique,
        converging towards the center. */
        String convertedNumber = String.valueOf(number);
        int size = convertedNumber.length();

        i = 0;
        j = size - 1;
        equal = true;
        
        /* The second condition establishes that while the values ​​being compared are equal, 
        the loop can continue; as soon as two different values ​​are found, the loop stops and the number is recognized as not a palindrome. */
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

