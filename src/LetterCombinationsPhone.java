import java.util.ArrayList;
import java.util.Map;

public class LetterCombinationsPhone {
     ArrayList<String> combinationsList = new ArrayList<String>();

     Map<Character, String> numericKeypad = Map.of(
        '2', "abc",
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    // Wrapper method
    public ArrayList<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return combinationsList;
        }

        possibleCombinations(digits, "", 0);
        return combinationsList;
    }


    // Recursive method
    public void possibleCombinations (String inputString, String currentCombination, int i) {

        int inputStringSize = inputString.length();

        // Basic step
        if (i == inputStringSize) {
            combinationsList.add(currentCombination);
            return;
        }
        
        // Recursive step
        char tempDigit = inputString.charAt(i);
        String tempString = numericKeypad.get(tempDigit);
        int j = 0;
        int tempStringSize = tempString.length();
        while (j < tempStringSize) {
            char currentChar = tempString.charAt(j);
            possibleCombinations(inputString, currentCombination + currentChar, i + 1);
            j = j + 1;
        }
    }

    public static void main(String[] args) throws Exception {
        // Test case
        LetterCombinationsPhone solver = new LetterCombinationsPhone();
        ArrayList<String> combinationsList = solver.letterCombinations("269");
        System.out.println("Possible Combinations List: ");
        for (String elem : combinationsList) {
            System.out.print(elem + " ");
        }
    }
}
