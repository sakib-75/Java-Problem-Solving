package remove_duplicates;

public class DuplicatesFromString {
    public static StringBuilder removeDuplicateChars(String str) {
        char[] char_arr = str.toCharArray();
        StringBuilder targetStr = new StringBuilder();

        for (char c : char_arr) {
            if (targetStr.indexOf(String.valueOf(c)) == -1) {
                targetStr.append(c);
            }
        }
        return targetStr;
    }

    public static void main(String[] args) {
        String str = "abcabddcs";
        System.out.println("The given string is: " + str);
        System.out.print("After removing duplicates characters: ");
        System.out.print(removeDuplicateChars(str));
    }

}
