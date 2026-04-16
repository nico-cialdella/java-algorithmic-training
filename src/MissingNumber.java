public class MissingNumber {
    public int missingNumber(int[] nums) {
        // First of all, we need to sort the array in ascending order
        int missingValue;
        int i = 0;
        int j;
        int dimArray = nums.length;
        while (i < dimArray - 1) {
            j = i + 1;
            while (j < dimArray) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j = j + 1;
            }
            i = i + 1;
        }

        // Now we can search for the missing number
        i = 0;
        while (i < dimArray) {
            if (nums[i] != i) {
                missingValue = i;
                return missingValue;
            }
            i++;
        }
        return dimArray;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        MissingNumber solver = new MissingNumber();
        int[] array1 = {4, 7, 1, 0, 3, 5, 6}; // Expected Output: 2
        int[] array2 = {1, 2, 3}; // Expected Output: 0

        int missingValueArray1 = solver.missingNumber(array1);
        int missingValueArray2 = solver.missingNumber(array2);

        System.out.println("The missing number in the first array is " + missingValueArray1);
        System.out.println("The missing number in the second array is " + missingValueArray2);
    }
}
