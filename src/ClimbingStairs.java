/*
  To solve this problem, I started by making some tests on paper, 
  using small values for the variable n (1 <= n <= 5) and I saw 
  that the number of ways to reach the top was exactly the Fibonacci sequence. 
  So, this is an iterative algorithm using the Fibonacci sequence to count 
  the ways to reach the top for a specific number of steps, climbing each time 1 or 2 steps.
 */

public class ClimbingStairs {
    public int countWaysToClimb(int n) {
        int ways = 0;
        int prev_step_ways = 2;
        int two_prev_steps_ways = 1;
        int i = 1;

        while (i <= n) {
            if (i <= 2) {
                ways = i;
            } else {
                ways = prev_step_ways + two_prev_steps_ways;
                two_prev_steps_ways = prev_step_ways;
                prev_step_ways = ways;
            }
            i = i + 1;
        }
        return ways;
    }

    public static void main(String[] args) throws Exception {
        // Test case
        ClimbingStairs solver = new ClimbingStairs();
        int test_case_ways = solver.countWaysToClimb(15);

        System.out.println("On a 15-step staircase, you can climb to the top in " + test_case_ways + " ways.");
    }
}
