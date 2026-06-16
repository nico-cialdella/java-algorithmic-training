import java.util.HashSet;
import java.lang.Math;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; // index that moves forward when a new character is found
        int k = 0; // index that moves forward to remove the duplicate and shrink the substring
        int current_length = 0;
        int max_length = 0;
        int string_length = s.length();
        HashSet<Character> hashset = new HashSet<>();

        while (i < string_length) {
            if (!hashset.contains(s.charAt(i))) {
                hashset.add(s.charAt(i));
                current_length++;
                max_length = Math.max(max_length, current_length);
                i++;
            } else {
                hashset.remove(s.charAt(k));
                current_length--;
                k++;
            }
            
        }
        return max_length;
    }

    public static void main(String args[]) {
        String string1 = "dvdf";
        String string2 = "abcadef";
        String string3 = "pwwkew";
        // Test Cases
        LongestSubstring test = new LongestSubstring();
        int test1 = test.lengthOfLongestSubstring(string1); // Expected Output: 3
        int test2 = test.lengthOfLongestSubstring(string2); // Expected Output: 6
        int test3 = test.lengthOfLongestSubstring(string3); // Expected Output: 3

        System.out.println("The length of the longest substring without repeating characters in the string " + string1 + " is " + test1);
        System.out.println("The length of the longest substring without repeating characters in the string " + string2 + " is " + test2);
        System.out.println("The length of the longest substring without repeating characters in the string " + string3 + " is " + test3);
    }
}
