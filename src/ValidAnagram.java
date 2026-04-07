/***** NON-OPTIMIZED SOLUTION
public class ValidAnagram {
    public boolean isValidAnagram(String s, String t) {
        int dimPrimaStringa = s.length();
        int dimSecondaStringa = t.length();

        if (dimPrimaStringa != dimSecondaStringa) {
            return false;
        }

        int i = 0;
        boolean uguali = true;
        while (i < dimPrimaStringa && uguali == true) {
            int j = 0;
            int contaOccorrenzePrima = 0;
            while (j < dimPrimaStringa) {
                if (s.charAt(j) == s.charAt(i)) {
                    contaOccorrenzePrima++;
                }
                j = j + 1;
            }
            int k = 0;
            int contaOccorrenzeSeconda = 0;
            while (k < dimSecondaStringa) {
                if (t.charAt(k) == s.charAt(i)) {
                    contaOccorrenzeSeconda++;
                }
                k = k + 1;
            }
            if (contaOccorrenzePrima != contaOccorrenzeSeconda) {
                uguali = false;
            }
            i = i + 1;
        }
        return uguali;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        ValidAnagram solver = new ValidAnagram();
        boolean result1 = solver.isValidAnagram("anagram", "maragaan"); // Expected Output: False
        boolean result2 = solver.isValidAnagram("roma", "amor"); // Expected Output: True

        System.out.println("Is maragaan a valid anagram of anagram? ==> " + result1);
        System.out.println("Is amor a valid anagram of roma? ==> " + result2);
    }
}
*****/


/*
  This optimized solution consists of using an array (initially filled with 0s) 
  to store the occurrences of every character in the first string by incrementing 
  the values at the corresponding indexes. Then, in another loop, we check the 
  second string by decrementing the values in the occurrences array. 
  At the end of the algorithm, if the values of the occurrences array are all 
  equal to 0 again, then the second string is an anagram of the first and 
  the algorithm returns true, else it returns false.
 */
public class ValidAnagram {
    public boolean isValidAnagram(String s, String t) {

        int[] arrayFrequenze = new int[26];
        int dimPrimaStringa = s.length();
        int dimSecondaStringa = t.length();
        char carattere_attuale;
        int posizione_arr_frequenze;
        
        int i = 0;
        while (i < dimPrimaStringa) {
            carattere_attuale = s.charAt(i);
            posizione_arr_frequenze = carattere_attuale - 'a';
            arrayFrequenze[posizione_arr_frequenze]++;
            i++;
        }
        int j = 0;
        while (j < dimSecondaStringa) {
            carattere_attuale = t.charAt(j);
            posizione_arr_frequenze = carattere_attuale - 'a';
            arrayFrequenze[posizione_arr_frequenze]--;
            j = j + 1;
        }
        int k = 0;
        boolean bilanciato = true;
        while (k < arrayFrequenze.length) {
            if (arrayFrequenze[k] != 0) {
                bilanciato = false;
                return bilanciato;
            } else {
                k++;
            }
        }
        return bilanciato;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        ValidAnagram solver = new ValidAnagram();
        boolean firstCase = solver.isValidAnagram("anagram", "garanaam"); // Expected Output: false
        boolean secondCase = solver.isValidAnagram("roma", "amor"); // Expected Output: true

        System.out.println("Is garanaam an anagram of anagram? ==> " + firstCase);
        System.out.println("Is amor an anagram of roma? ==> " + secondCase);
    }
}

