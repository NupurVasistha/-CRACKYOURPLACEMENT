public class sort_colors {

    public void sortColors(int[] nums) {
        int i = 0, start = 0, end = nums.length - 1;

        while (i <= end) {
            if (nums[i] == 0) {
                swap(nums, start++, i++);
            } else if (nums[i] == 2) {
                swap(nums, end--, i);
            } else {
                i++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
