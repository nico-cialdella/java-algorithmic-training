import java.util.*;

public class Subsets {
    private void backtracking(List<List<Integer>> finalResult, List<Integer> currentPath, int[] nums, int start) {

        finalResult.add(new ArrayList<>(currentPath));

        for (int i = start; i < nums.length; i++) {
            currentPath.add(nums[i]);
            backtracking(finalResult, currentPath, nums, i+1);
            currentPath.remove(currentPath.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> finalResult = new ArrayList<>();

        backtracking(finalResult, new ArrayList<>(), nums, 0);

        return finalResult;
    }

    public static void main() {
        // Test case
        int[] set = {1, 2, 3, 4};

        Subsets solver = new Subsets();

        List<List<Integer>> subsetsList = solver.subsets(set);
        System.out.println(subsetsList);
    }
}
