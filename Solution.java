
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int width = right - left;
            int area = Math.min(height[left], height[right]) * width;

            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println("Maximum Water = " + obj.maxArea(height));
    }
}
