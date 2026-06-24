
import java.util.*;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(nums, (a, b) -> {
            int f1 = freq.get(a);
            int f2 = freq.get(b);

            if (f1 != f2)
                return f2 - f1; // Higher frequency first
            return a - b;      // Smaller element first if same frequency
        });

        System.out.println(Arrays.toString(nums));
    }
}
