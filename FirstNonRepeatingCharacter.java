import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String str) {
        HashMap<Character, Integer> map = new HashMap<>();

     
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }

        return '\0'; 
    }

    public static void main(String[] args) {
        String str = "aabbcdde";

        char result = firstNonRepeating(str);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
    }
}
