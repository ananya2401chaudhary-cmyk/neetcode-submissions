class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        if(nums.length==1){
            return nums[0];
        }if(nums.length==0){
            return 0;
        }
    
    return Math.max(
    robRange(nums, 0, n-2),
    robRange(nums, 1, n-1));
    }
    public int robRange(int[] nums, int start, int end){
        int prev1=0, prev2=0;
        int curr=0;
        for(int i=start; i<=end; i++){
            curr= Math.max(prev2+nums[i], prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
