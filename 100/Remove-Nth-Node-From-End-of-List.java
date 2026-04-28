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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13       
14        int count=0;
15        ListNode curr=head;
16        while(curr!=null){
17            curr=curr.next;
18            count++;
19        }
20         if (n == count) {
21            return head.next;
22        }
23        curr = head;
24        int i=1;
25        while(curr!=null && curr.next!=null){
26            if(i==count-n){
27                curr.next=curr.next.next;
28            }
29            i++;
30            curr=curr.next;
31        }
32        return head;
33    }
34}