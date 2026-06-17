import java.util.Arrays;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        int length = nums.length;
        
        // A solution with A linear runtime complexity can be implemented using the XOR operator (^)
        for (int i = 0; i < length; i++) {
            result = result ^ nums[i]; 
        }
        return result;
    }

    public static void main(String args[]) {
        // Test Cases
        SingleNumber test = new SingleNumber();
        int[] array1 = {2, 2, 1}; // Expected Output: 1
        int[] array2 = {4, 1, 2, 1, 2}; // Expected Output: 4
        int[] array3 = {1}; // Expected Output: 1

        int test1 = test.singleNumber(array1);
        int test2 = test.singleNumber(array2);
        int test3 = test.singleNumber(array3);

        System.out.println("The single number in the array " + Arrays.toString(array1) + " is " + test1);
        System.out.println("The single number in the array " + Arrays.toString(array2) + " is " + test2);
        System.out.println("The single number in the array " + Arrays.toString(array3) + " is " + test3);
    }
}
