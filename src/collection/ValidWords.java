package collection;

public class ValidWords {

    public static void main(String[] args) {

        String input = "java microservices dev@ops Np089";
        String[] words = input.split(" ");

        for (String word : words) {

            if (isValid(word)) {
                System.out.println(word);
            }
        }
    }

    public static boolean isValid(String word) {

        // length check
        if (word.length() > 4) {
            return false;
        }

        // character check
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z'))) {
                return false;
            }
        }

        return true;
    }
}
