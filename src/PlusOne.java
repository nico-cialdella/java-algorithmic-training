import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        // First case to handle: all digits in the array are 9
        int i = 0;
        boolean allNine = true;
        int dimArray = digits.length;

        while (i < dimArray) {
            if (digits[i] != 9) {
                allNine = false;
            }
            i++;
        }

        if (allNine) {
            int[] newDigits = new int[dimArray + 1];
            newDigits[0] = 1;
            return newDigits;
        } else if (!allNine) {
            /* Second case to handle: the array ends with a variable number of digits equal to 9
               Third case to handle: the array doesn't end with any digit equal to 9 */
            i = dimArray - 1;
            if (digits[i] == 9) {
                while (i > 0 && digits[i] == 9) {
                    digits[i] = 0;
                    i--;
                }
            }
            digits[i] = digits[i] + 1;       
        }
        return digits;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        PlusOne solver = new PlusOne();
        int[] array1 = {4, 3, 2, 1};
        int[] array2 = {9};
        int[] array3 = {5, 7, 9, 9};

        int[] array1PlusOne = solver.plusOne(array1);
        int[] array2PlusOne = solver.plusOne(array2);
        int[] array3PlusOne = solver.plusOne(array3);
        
        /* We have to use the Arrays.toString() method from the standard Java library 
        to print the elements of the resulting arrays, rather than their memory addresses. */
        System.out.println("array1 plus one: " + Arrays.toString(array1PlusOne));
        System.out.println("array2 plus one: " + Arrays.toString(array2PlusOne));
        System.out.println("array3 plus one: " + Arrays.toString(array3PlusOne));
    }
}
