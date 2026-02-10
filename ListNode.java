package com.dailyPractice;

public class ListNode {

	int value;
	ListNode next;
	
	
	public ListNode() {}
	
	public ListNode(int value) {
		this.value = value;
	}
	
	public ListNode(int value, ListNode next) {
		this.value = value;
		this.next = next;
	}
	
	public class Solutions{
		
		public static ListNode iteration(ListNode head) {
			
			ListNode current = head;
			ListNode prev = null;
			
			while(current != null) {
				ListNode temp = current.next;
				current.next = prev;
				prev = current;
				current = temp;
			}
			
			return prev;
		}
		
		public static ListNode recursion(ListNode head) {
			if(head == null || head.next == null)
				return head;
			
			ListNode newHead = recursion(head.next);
			
			head.next.next = head;
			head.next = null;
			
			return newHead;
		}
	}
	
	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next =new ListNode(3);
		head.next.next.next =new ListNode(4);
		head.next.next.next.next =new ListNode(5);
		
		ListNode current = head;
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		
		System.out.println("----iteration----");
		
		head = Solutions.iteration(head);
		current = head;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		
		System.out.println("----recursion----");
		
		head = Solutions.iteration(head);
		current = head;
		
		while(current != null) {
			System.out.println(current.value);
			current = current.next;
		}
		
	}
}
