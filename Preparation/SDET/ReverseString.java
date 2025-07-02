package java.Preparation.SDET;

public class ReverseString {
    public static void main(String[] args) {
        String words = "hi how are you today";
        reverseWords(words);
    }

    public static void reverseWords(String words) {
        StringBuilder sb = new StringBuilder();
        String[] word1 = words.split(" ");
        for(int i = word1.length - 1; i >= 0; i--) {
            sb.append(word1[i]).append(" ");
        }
        System.out.println(sb.toString());
        }
    }

