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
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null){
14            return null;
15        }
16        while(head!=null && head.val==val){
17            head=head.next;
18        }
19        ListNode curr=head;
20        while(curr!=null && curr.next!=null){
21            if(curr.next.val==val){
22                curr.next=curr.next.next;
23            }
24            else{
25            curr=curr.next;
26            }
27        }
28        return head;
29    }
30}