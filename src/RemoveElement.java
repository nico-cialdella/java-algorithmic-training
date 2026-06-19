public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        int k = 0;

        while (i < length) {
            if (nums[i] != val) {
                int valid_number = nums[i];
                nums[k] = valid_number;
                k++;
            }
            i++;
        }
        return k;
    }
    public static void main(String args[]) {
        // Test Cases
        RemoveElement test = new RemoveElement();
        int[] arr_1 = {3, 2, 2, 3};
        int val_1 = 3;
        int[] arr_2 = {0,1,2,2,3,0,4,2};
        int val_2 = 2;

        int valid_elements_arr_1 = test.removeElement(arr_1, val_1); // Expected Output: 2
        int valid_elements_arr_2 = test.removeElement(arr_2, val_2); // Expected Output: 5

        System.out.println("The number of elements in arr_1 which are not equal to " + val_1 + " is " + valid_elements_arr_1);
        System.out.println("The number of elements in arr_2 which are not equal to " + val_2 + " is " + valid_elements_arr_2);
    }
}
