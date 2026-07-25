class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // store them in another space 
        int []arr=nums.clone();
         int i=0,k=0;
         
         while(k<arr.length){
        if(arr[k]<pivot)
            nums[i++]=arr[k];
         k++;
         }
        k=0;
         while(k<arr.length){
        if(arr[k]==pivot)
            nums[i++]=arr[k];
         k++;
         }

        k=0;
        while(k<arr.length){
        if(arr[k]>pivot)
            nums[i++]=arr[k];
         k++;
         }

        


return nums;
    }

}