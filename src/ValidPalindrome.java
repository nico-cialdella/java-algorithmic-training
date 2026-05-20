public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int dim = s.length();
        int i = 0;
        int j = dim - 1;

        /* The logic of the algorithm is divided into four steps:
        01. Check that index i is less than index j;
        02. Check that characters at indices i and j are alphanumeric;
        03. Convert the characters indexed by i and j to lowercase;
        04. Compare the two characters. If they do not match, return false and exit the algorithm. Otherwise, proceed with the next comparison.
         */
        while (i < j) {

            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }

            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }

            char char_at_i_lower = Character.toLowerCase(s.charAt(i));
            char char_at_j_lower = Character.toLowerCase(s.charAt(j));

            if (char_at_i_lower != char_at_j_lower) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        ValidPalindrome example_string = new ValidPalindrome();
        boolean test1 = example_string.isPalindrome("A man, a plan, a canal: Panama"); // Expected Output: true
        boolean test2 = example_string.isPalindrome("Race a car"); // Expected Output: false

        if (test1) {
            System.out.println("amanaplanacanalpanama is a palindrome");
        } else {
            System.out.println("amanaplanacanalpanama is not a palindrome");
        }

        if (test2) {
            System.out.println("raceacar is a palindrome");
        } else {
            System.out.println("raceacar is not a palindrome");
        }
    }
}
