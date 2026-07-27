class Solution {
    public int maxProduct(int[] nums) {
        int l=0;
        int l2=0;
       
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]>l)
            {
                l2=l;
                l=nums[j];
            }
            else if(nums[j]>l2)
            l2=nums[j];
        }
       return ((l-1)*(l2-1));
    }
}
