/*You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their 
nodes contain a single digit. Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (4 -> 6 -> 4)
Output: 6 -> 0 -> 8
*/
/*题解：

这道题就是给的加数是倒着给的，你返回的结果也是倒着写的，所以进位也反着进就好。

维护一个carry，加数大于9时候carry为1，也要注意两个数相加如果大于9的话，要写取模后的值。

最后如果 有进位，要记得加上。
结果的第一位 head,用来返回
*/
 
public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /**
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
    public ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        if(l1 == null){
            return l2;
            
        }
        if(l2 == null){
            return l1;
        }
        
        int carry = 0;
        ListNode l3 = null ;
        ListNode head = null;
        while (l1 != null || l2 != null){
            if(l1 != null){
                carry = carry + l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                carry = carry + l2.val;
                l2 = l2.next;
            }
            
            ListNode next = new ListNode(carry%10);
            if(l3 == null){
                head = next;
                l3 = next;
            }else{
                l3.next = next;
                l3 =l3.next;
            }
            carry = carry /10;
        }
        if(carry != 0){
            l3.next = new ListNode(carry);
            l3 = l3.next;
        }
        return head;
    }
}
