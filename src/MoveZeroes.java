import java.util.Arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int k = 0;

        while (i < length) {
            if (nums[i] == 0) {
                k = i + 1;
                while (k < length) {
                    if (nums[k] != 0) {
                        int temp_zero = nums[i];
                        nums[i] = nums[k];
                        nums[k] = temp_zero;
                        break;
                    }
                    k++;
                }
            }
            i++;
        }
    }

    public static void main(String args[]) {
        // Test Cases
        MoveZeroes test = new MoveZeroes();
        int[] arr_1 = {0, 1, 0, 3, 12};
        int[] arr_2 = {4, 0, 1, 0, 2};
        int[] arr_3 = {0, 0, 6, 9, 0, 4};

        test.moveZeroes(arr_1);
        test.moveZeroes(arr_2);
        test.moveZeroes(arr_3);

        System.out.println("After moving all 0's to the end, arr_1 becomes " + Arrays.toString(arr_1));
        System.out.println("After moving all 0's to the end, arr_2 becomes " + Arrays.toString(arr_2));
        System.out.println("After moving all 0's to the end, arr_3 becomes " + Arrays.toString(arr_3));
    }
}
