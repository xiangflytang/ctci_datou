public class Solution {
    /**
     * @param lists: a list of ListNode
     * @return: The head of one sorted list.
     */
     
     // comparator, priority queue
     // null case.
     // put k nodes into heap
     // use while loop on heap
     
     private Comparator<ListNode> heapComparator = new Comparator<ListNode>(){
            public int compare(ListNode left, ListNode right){
                return left.val - right.val;
            }
        } ;
     
    public ListNode mergeKLists(List<ListNode> lists) {  
        // write your code here
       if(lists == null || lists.size() == 0 ){
           return null;
       }
       
       PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(lists.size(), heapComparator);
       ListNode dummy = new ListNode(0);
       ListNode tail = dummy;
       for(int i = 0; i < lists.size();i++ ){
           if(lists.get(i) != null){
               heap.add(lists.get(i));
           }
       }
       
       while(heap.size() != 0){
           ListNode head = heap.poll();
           tail.next = head;
           tail = tail.next;
           if(head.next != null){
               head = head.next;
               heap.add(head);
           }
       }
       return dummy.next;
    }
}
