import java.util.HashMap;

public class Two_Sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            //Better Approach
            HashMap<Integer , Integer> mpp = new HashMap<>();
            int arr[] = new int[2];
            arr[0] = -1;
            arr[1] = -1;
            for(int i=0;i<nums.length;i++){
                int number = nums[i];
                int ans = target-number;

                if(mpp.containsKey(ans)){
                    arr[0] = mpp.get(ans);
                    arr[1] = i;
                }
                mpp.put(nums[i],i);
            }
                return arr;
        }
    }
}
