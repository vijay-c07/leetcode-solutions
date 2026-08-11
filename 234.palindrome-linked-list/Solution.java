/*
Brute Force Approach 
class Solution {
    public boolean isPalindrome(ListNode head) {

            Stack <Integer> stack= new Stack<>();
            ListNode temp=head;

            while(temp!=null){
                stack.push(temp.val);
                temp=temp.next;
            }
            temp=head;
            int n=stack.size()/2;

            for(int i=1;i<=n;i++){
                int number=stack.pop();
                int listval=temp.val;
                if(listval != number)
                return false;
                temp=temp.next;
            }



   return true;

           

    }
}*/