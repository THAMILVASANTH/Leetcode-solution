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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode Mid=Mid(head);
        ListNode RevList=Reverse(Mid.next);
        ListNode T1=head;
        ListNode T2=RevList;
        Mid.next = null;
        while(T2!=null){
            if (T1.val != T2.val) return false;
            T1 = T1.next;
            T2 = T2.next;
        }
        return true;
    }
    public ListNode Mid(ListNode head){
        ListNode T=head;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode Reverse(ListNode head){
        ListNode T=head;
        ListNode Prev=null;
        while(T!=null){
            ListNode Front=T.next;
            T.next=Prev;
            Prev=T;
            T=Front;
        }
        return Prev;
    }
    }