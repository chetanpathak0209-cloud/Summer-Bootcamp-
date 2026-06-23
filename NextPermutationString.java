public class NextPermutationString {

    public static String nextPermutation(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;

        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return "No Next Permutation";
        }

        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "ABCD";

        System.out.println("Next Permutation: " + nextPermutation(str));
    }
}