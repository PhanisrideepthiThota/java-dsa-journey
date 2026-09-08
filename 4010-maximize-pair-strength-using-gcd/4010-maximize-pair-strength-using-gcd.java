class Solution {
    public long maxPairStrength(int[] nums) {
        long  max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int g=gcd(nums[i],nums[j]);

                long strength = ((long) nums[i] / g) * (nums[j] / g);
                
                max=Math.max(max,strength);
            }
        }
        return max;

    }
    public int gcd(int x,int y){
      while(y!=0){
        int temp=x%y;
        x=y;
        y=temp;
      }
      return x;
    }
}