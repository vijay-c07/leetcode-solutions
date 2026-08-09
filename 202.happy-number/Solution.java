class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
       
        while(n!=1 && !seen.contains(n)){
            int sum=0;
            seen.add(n);

            while(n>0){
            int rem=n%10;
            sum=sum+rem*rem;
            n/=10;
            }
           

            n=sum;

        }
        return n==1;
    }
}