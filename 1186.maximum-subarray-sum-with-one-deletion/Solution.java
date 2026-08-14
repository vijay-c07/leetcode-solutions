class Solution {
    public int maximumSum(int[] arr) {
        if(arr.length==1) return arr[0];
        int Nodeletion=arr[0];
        int deletion=arr[0];
        int ans=arr[0];

        for(int i=1;i<arr.length;i++){
            int currdlt=(Nodeletion>deletion+arr[i])? Nodeletion:deletion+arr[i];
            int currnodlt=(arr[i] > Nodeletion + arr[i]) ? arr[i] : Nodeletion + arr[i];
            deletion = currdlt;
            Nodeletion = currnodlt;
            
            int stepMax = (Nodeletion > deletion) ? Nodeletion : deletion;
            ans = (ans > stepMax) ? ans : stepMax;
        }
        
        return ans;
    }
}