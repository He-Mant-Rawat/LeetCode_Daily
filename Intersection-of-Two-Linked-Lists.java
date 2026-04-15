1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode a=headA;
15        ListNode b=headB;
16        while(a!=b){
17            if(a==null){
18                a=headB;
19            }   else{
20                    a=a.next;
21                }
22            if(b==null){
23                b=headA;
24            }
25             else{
26                    b=b.next;
27                }
28        }
29        
30        return a;
31    }
32}