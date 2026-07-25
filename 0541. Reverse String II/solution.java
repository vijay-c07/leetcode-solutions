class Solution {
    public String reverseStr(String s, int k) {
         
           char[] arr=s.toCharArray();
         int n=arr.length;
            char temp;
         for(int i=0;i<n;i+=2*k){
            int start=i;
            int end=Math.min(i+k-1,n-1);
         
    
        while(start<end){
              
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
         }
       s= new String(arr);
      return s;  
    }
    

}