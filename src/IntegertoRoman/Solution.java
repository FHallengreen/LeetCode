package IntegertoRoman;

public class Solution {

    public String intToRoman(int num) {
        String result = "";

        String numStr = Integer.toString(num);
        int[] numArr = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            numArr[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < numArr.length; i++) {
            if (numArr.length - i == 1) {
                result += getRomanNumeral(numArr[i], "I", "V", "X");
            } else if (numArr.length - i == 2) {
                result += getRomanNumeral(numArr[i], "X", "L", "C");
            } else if (numArr.length - i == 3) {
                result += getRomanNumeral(numArr[i], "C", "D", "M");
            } else if (numArr.length - i == 4) {
                result += getRomanNumeral(numArr[i], "M", "", "");
            }
        }

        return result;
    }

    private String getRomanNumeral(int i, String lowerNumber, String middleNumber, String topNumber) {
        String result = "";
        if (i == 1) {
            result += lowerNumber;
        } else if (i == 2) {
            result += lowerNumber + lowerNumber;
        } else if (i == 3) {
            result += lowerNumber + lowerNumber + lowerNumber;
        } else if (i == 4) {
            result += lowerNumber + middleNumber;
        } else if (i == 5) {
            result += middleNumber;
        } else if (i == 6) {
            result += middleNumber + lowerNumber;
        } else if (i == 7) {
            result += middleNumber + lowerNumber + lowerNumber;
        } else if (i == 8) {
            result += middleNumber + lowerNumber + lowerNumber + lowerNumber;
        } else if (i == 9) {
            result += lowerNumber + topNumber;
        } else if (i == 10) {
            result += topNumber;
        }

        return result;
    }

    public static void main(String[] args) {
        int num = 3099;
        Solution solution = new Solution();
        String romanNumeral = solution.intToRoman(num);
        System.out.println(romanNumeral);
    }


}
