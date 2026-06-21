
public class PatternReplacement {
    public static void main(String[] args) {
        String str1 = "ABCABCXABCXYbw";
        String pattern = "ABC";

        String result = str1.replace(pattern, "*");

        System.out.println(result);
    }
}
