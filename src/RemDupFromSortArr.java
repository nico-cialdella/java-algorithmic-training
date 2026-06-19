public class RemDupFromSortArr {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int i = 1;
        int k = 1;
        
        while (i < length) {
            if (nums[i] != nums[i - 1]) {
                int new_elem = nums[i];
                nums[k] = new_elem;
                k++;
            }
            i++;
        }
        return k;
    }

    public static void main(String args[]) {
        // Test Cases
        RemDupFromSortArr test = new RemDupFromSortArr();
        int[] arr_1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Expected Output: 5, arr_1 = {0, 1, 2, 3, 4, _, _, _, _, _}
        int[] arr_2 = {1, 1, 2}; // Expected Output: 2, arr_2 = {1, 2, _}
        int[] arr_3 = {4, 4, 4, 5, 6, 7, 8, 8, 9, 10, 10, 10}; // Expected Output: 7, arr_3 = {4, 5, 6, 7, 8, 9, 10, _, _, _, _, _}

        int unique_elements_arr_1 = test.removeDuplicates(arr_1);
        int unique_elements_arr_2 = test.removeDuplicates(arr_2);
        int unique_elements_arr_3 = test.removeDuplicates(arr_3);

        System.out.println("arr_1 contains " + unique_elements_arr_1 + " unique elements");
        System.out.println("arr_2 contains " + unique_elements_arr_2 + " unique elements");
        System.out.println("arr_3 contains " + unique_elements_arr_3 + " unique elements");
    }
}
