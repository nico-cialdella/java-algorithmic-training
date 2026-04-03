public class LongestCommonPrefix {
    public String searchPrefix(String strs[]) {
        int i;
        int j;
        /* StringBuilder is a Java class that allows us to build a string char by char 
        using the append() method. We use it here to optimize and speed up the algorithm. */
        StringBuilder prefixBuilder = new StringBuilder();

        i = 0;
        while (i < strs[0].length()) {
            j = 1;
            char tempChar = strs[0].charAt(i);
            while (j < strs.length) {
                if (i == strs[j].length() || strs[j].charAt(i) != tempChar) {
                    return prefixBuilder.toString();
                }
                j = j + 1;
            }
            prefixBuilder.append(tempChar);
            i = i + 1;
        }
        return prefixBuilder.toString();
    }

    public static void main(String[] args) throws Exception {
        // Test case
        String[] words = {"flower", "flow", "flight"};
        LongestCommonPrefix solver = new LongestCommonPrefix();
        String commonPrefix = solver.searchPrefix(words);

        System.out.println("The longest common prefix is " + commonPrefix);
    }
}
