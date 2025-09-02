package Practice.String;

public class stringTitle {
    public static void main(String[] args) {
        String str = "hello world from java";
        String titledStr = toTitleCase(str);
        System.out.println("Original String: " + str);
        System.out.println("Title Case String: " + titledStr);
    }

    public static String toTitleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder titled = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                titled.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return titled.toString().trim();
    }
}
