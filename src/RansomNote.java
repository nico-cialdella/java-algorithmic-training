public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] englishAlphabet = new int[26];
        int dimRansomNote = ransomNote.length();
        int dimMagazine = magazine.length();

        int j = 0;
        while (j < dimMagazine) {
            char temp = magazine.charAt(j);
            englishAlphabet[temp - 'a']++;
            j++;
        }

        int k = 0;
        while (k < dimRansomNote) {
            char temp = ransomNote.charAt(k);

            if (englishAlphabet[temp - 'a'] == 0) {
                return false;
            } else {
                englishAlphabet[temp - 'a']--;
            }
            k++;
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        RansomNote test = new RansomNote();
        boolean result1 = test.canConstruct("aa", "ab");
        boolean result2 = test.canConstruct("aa", "aab");

        if (result1) {
            System.out.println("The first ransomNote can be constructed by using the letters from the first magazine");
        } else {
            System.out.println("The first ransomNote can't be constructed by using the letters from the first magazine");
        }

        if (result2) {
            System.out.println("The second ransomNote can be constructed by using the letters from the second magazine");
        } else {
            System.out.println("The second ransomNote can't be constructed by using the letters from the second magazine");
        }
    }
}
