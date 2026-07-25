class Solution {
    public int[] rearrangeArray(int[] nums) {
        // store into an array
        int []arr=new int[nums.length];
        int i=0,k,j=nums.length-1;
        for(k=0;k<nums.length;k++){
            if(nums[k]>0){
            arr[i++]=nums[k];
            }
            else{
              arr[j--]=nums[k];
            }

        }
        i=0;
        j=nums.length-1;
        k=0;
        while(i<j){
            nums[k++]=arr[i++];
            nums[k++]=arr[j--];
        }
        return nums;
    }
}