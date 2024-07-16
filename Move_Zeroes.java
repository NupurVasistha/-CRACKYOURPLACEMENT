public class Move_Zeroes {
    class Solution {
        public void moveZeroes(int[] nums) {
            int x = 0;
            for(int i = 0;i < nums.length; i++)
            {
                if(nums[i] == 0)
                x++;
    
                else if(x > 0){
                    int t = nums[i];
                    nums[i] = 0;
                    nums[i-x] = t;
                }
            }
        }
    }   
}
