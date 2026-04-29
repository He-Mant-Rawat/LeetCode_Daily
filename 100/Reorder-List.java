1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public void reorderList(ListNode head) {
13        if(head==null || head.next==null){
14            return;
15        }
16        ListNode s=head;
17        ListNode f=head;
18        while(f!=null && f.next!=null){
19            s=s.next;
20            f=f.next.next;
21        }
22        ListNode curr = s.next;
23        s.next = null;
24        ListNode prev=null;
25        while(curr!=null){
26            ListNode temp=curr.next;
27            curr.next=prev;
28            prev=curr;
29            curr=temp;
30        }
31        curr=prev;
32        ListNode curr1=head;
33        while(curr != null){
34            ListNode temp1 = curr1.next;
35            ListNode temp2 = curr.next;
36
37            curr1.next = curr;
38            curr.next = temp1;
39
40            curr1 = temp1;
41            curr = temp2;
42        }
43    }
44}