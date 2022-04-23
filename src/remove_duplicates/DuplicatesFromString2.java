package remove_duplicates;

public class DuplicatesFromString2 {

    public static String unique(String str) {
        StringBuilder new_str = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (new_str.toString().indexOf(c) == -1) {
                new_str.append(c);
            }
        }

        return new_str.toString();
    }

    // Driver code
    public static void main(String[] args) {
        String s = "xyxzyxz";
        System.out.print("After removing duplicates characters: ");
        System.out.println(unique(s));
    }

}
