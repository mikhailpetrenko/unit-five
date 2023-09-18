public class BalancedPars {
    public static boolean allCheck(String str) {
        boolean isCorrect = false;
        if (checkPars(str) & curly(str) & square(str) & angles(str)) {
            isCorrect = true;
        }
        return isCorrect;
    }
    public static boolean checkPars(String str) {
        boolean isCorrect = false;
        int counter = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
            } else if (str.charAt(i) == ')') {
                counter--;
                if (counter < 0) {
                    isCorrect = false;
                    return isCorrect;
                }
            }
        }
        if (counter == 0) {
            isCorrect = true;
        }
        return isCorrect;
    }
    public static boolean curly(String str) {
        boolean isCorrect = false;
        int counter = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '{') {
                counter++;
            } else if (str.charAt(i) == '}') {
                counter--;
                if (counter < 0) {
                    isCorrect = false;
                    return isCorrect;
                }
            }
        }
        if (counter == 0) {
            isCorrect = true;
        }
        return isCorrect;
    }
    public static boolean square(String str) {
        boolean isCorrect = false;
        int counter = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '[') {
                counter++;
            } else if (str.charAt(i) == ']') {
                counter--;
                if (counter < 0) {
                    isCorrect = false;
                    return isCorrect;
                }
            }
        }
        if (counter == 0) {
            isCorrect = true;
        }
        return isCorrect;
    }
    public static boolean angles(String str) {
        boolean isCorrect = false;
        int counter = 0;
        for (int i = 0; i<str.length(); i++) {
            if (str.charAt(i) == '<') {
                counter++;
            } else if (str.charAt(i) == '>') {
                counter--;
                if (counter < 0) {
                    isCorrect = false;
                    return isCorrect;
                }
            }
        }
        if (counter == 0) {
            isCorrect = true;
        }
        return isCorrect;
    }


public static void main(String[] args) {
        String testString1 = "{([()]<>)}";
        String testString2 = "{[(])}";

        boolean result1 = allCheck(testString1);
        boolean result2 = allCheck(testString2);

        System.out.println("Test String 1 is balanced: " + result1);
        System.out.println("Test String 2 is balanced: " + result2);



}
