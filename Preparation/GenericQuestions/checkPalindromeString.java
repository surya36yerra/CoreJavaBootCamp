package java.Preparation.GenericQuestions;

public class checkPalindromeString {
    public static void main(String[] args) {
        boolean b = checkPalindromeString("surya");
        System.out.println(b);
        removeWhiteSpaces("  abc  def");
    }

    static boolean checkPalindromeString(String input) {
        boolean result = true;
        int length = input.length();

        for (int i = 0; i < length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }

        return result;
    }

        static void removeWhiteSpaces(String input){
            System.out.println(","+input.strip()+",");
        }

        }

