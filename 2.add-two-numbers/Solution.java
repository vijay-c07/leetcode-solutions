/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int num1=l1.val , num2=l2.val  ,sum;
        ListNode t1=l1,t2=l2;

        while(t1.next!=null)
        {    num1=(num1*10)+t1.next.val;
            t1=t1.next;
          
        }
        int rnum1=0;
        while(num1>0){
            int rem=num1%10;
            rnum1=(rnum1*10)+rem;
            num1/=10;
        }
        
         while(t2.next!=null)
        {   num2=(num2*10)+t2.next.val;
            t2=t2.next;
        }
            int rnum2=0;
        while(num2>0){
            int rem=num2%10;
            rnum2=(rnum2*10)+rem;
            num2/=10;
        }
        sum=rnum1+rnum2;

        ListNode result=null ;

        while(sum>0){
           int rem=sum%10;
            ListNode newNode =new ListNode(rem);

               if(result==null)
               result=newNode;

               else{
                    ListNode last=result;

                    while(last.next!=null)
                    last=last.next;

                    last.next=newNode;
                }
                sum/=10;
           
            
            }
       if(result==null)
       result=new ListNode(0);


        
        return result;
    }
}