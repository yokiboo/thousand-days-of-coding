package com.dailyPractice;

import java.util.EmptyStackException;

public class GenericStackPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class GenericStack<T> {
		
		private class Node<T>{
			
			T value;
			Node<T> next;
			
			public Node(T value) {
				this.value = value;
				this.next = null;
			}
		}
		
		Node<T> top;
		
		public GenericStack() {
			this.top = null;
		}
		
		public void push(T value) {
			Node<T> node = new Node<>(value);
			node.next = top;
			top = node;
		}
		
		public T pop() {
			if(top == null) {
				throw new EmptyStackException();
			}
			
			T value = top.value;
			top = top.next;
			return value;
		}
		
		public T peek() {
			if(top == null) {
				throw new EmptyStackException();
			}
			
			return top.value;
		}
		
		public boolean isEmpty() {
			
			return top == null;
		}
	}
}
