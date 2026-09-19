class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
             ans=i;
             break;
            }

        }
        if(ans==-1){
            return nums.length;
        }
        return ans;
    }
}