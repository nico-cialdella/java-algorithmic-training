
public class RomanToInteger {
    public int romanToInt(String romanNumber) {
        int dim = romanNumber.length();
        int temp;
        int i;

        temp = 0;
        i = 0;
        while (i < dim) {
            /* We start by checking the six subtraction cases (IV, IX, XL, XC, CD, CM), 
            where we subtract the first value from the second and increment the index i by 2. 
            For these "limit" cases, the strategy consists of analyzing characters in pairs. */
            if (romanNumber.charAt(i) == 'I') {
                if (i < dim - 1) {
                    switch (romanNumber.charAt(i+1)) {
                        case 'V':
                            temp = temp + 4;
                            i = i + 2;
                            break;
                        case 'X':
                            temp = temp + 9;
                            i = i + 2;
                            break;
                        default:
                            temp = temp + 1;
                            i = i + 1;
                    }
                } else {
                    temp = temp + 1;
                    i = i + 1;
                }
    
            } else if (romanNumber.charAt(i) == 'X') {
                if (i < dim - 1) {
                    switch (romanNumber.charAt(i+1)) {
                        case 'L':
                            temp = temp + 40;
                            i = i + 2;
                            break;
                        case 'C':
                            temp = temp + 90;
                            i = i + 2;
                            break;
                        default:
                            temp = temp + 10;
                            i = i + 1;
                    }
                } else {
                    temp = temp + 10;
                    i = i + 1;
                }

            } else if (romanNumber.charAt(i) == 'C') {
                if (i < dim - 1) {
                    switch (romanNumber.charAt(i+1)) {
                        case 'D':
                            temp = temp + 400;
                            i = i + 2;
                            break;
                        case 'M':
                            temp = temp + 900;
                            i = i + 2;
                            break;
                        default:
                            temp = temp + 100;
                            i = i + 1;
                    }
                } else {
                    temp = temp + 100;
                    i = i + 1;
                }
            /* The remaining roman numerals (V, L, D, M) are always followed by smaller numbers, 
            so we don't need to check them in pairs or perform subtractions. 
            We simply add their value to the variable temp and increment the counter by one. */
            } else if (romanNumber.charAt(i) == 'V') {
                temp = temp + 5;
                i = i + 1;
            } else if (romanNumber.charAt(i) == 'L') {
                temp = temp + 50;
                i = i + 1;
            } else if (romanNumber.charAt(i) == 'D') {
                temp = temp + 500;
                i = i + 1;
            } else if (romanNumber.charAt(i) == 'M') {
                temp = temp + 1000;
                i = i + 1;
            }
        }
        return temp;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        String firstRomanNumber = "XLIX";
        String secondRomanNumber = "VII";
        String thirdRomanNumber = "MMMCMXCIX";

        RomanToInteger solver = new RomanToInteger();

        int firstIntegerNumber = solver.romanToInt(firstRomanNumber);
        int secondIntegerNumber = solver.romanToInt(secondRomanNumber);
        int thirdIntegerNumber = solver.romanToInt(thirdRomanNumber);

        System.out.println(firstRomanNumber + " = " + firstIntegerNumber);
        System.out.println(secondRomanNumber + " = " + secondIntegerNumber);
        System.out.println(thirdRomanNumber + " = " + thirdIntegerNumber);
    }
}
