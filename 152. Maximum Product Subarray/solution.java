class Solution {
    public int maxProduct(int[] nums) {
        int minend=nums[0];
        int maxend=nums[0];
        int bestend=nums[0];
        int res=nums[0];

         
         for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*minend;
            int v3=nums[i]*maxend;

            minend=Math.min(v1,Math.min(v2,v3));
            maxend=Math.max(v1,Math.max(v2,v3));
            bestend=Math.max(minend,maxend);

            res=Math.max(res,bestend);

         }
         return res;
    }
}