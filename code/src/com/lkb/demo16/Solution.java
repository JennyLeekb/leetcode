package com.lkb.demo16;

public class Solution {

	public static void main(String[] args) {
		ListNode first = new ListNode(342,true);
		ListNode second = new ListNode(465,true);
		ListNode result = new Solution().addTwoNumbers(first, second);
		ListNode p = result.getNext();
		while (p != null) {
			System.out.print(p.getVal() + " -> ");
			p = p.getNext();
		}
	}

	/**
	 * leetcode2 两数相加
	 * 
	 * @param first
	 * @param second
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode first, ListNode second) {

		int val = first.getVal() + second.getVal();
		ListNode result = new ListNode(val,true);
		return result;
	}

}

class ListNode {
	private int val;
	private ListNode next;

	ListNode() {
		val = 0;
		next = null;
	}

	ListNode(int x) {
		val = x;
		next = null;
	}

	ListNode(int x, boolean flag) {
		this(x);
		if (flag) {
			int temp = x;
			ListNode p = new ListNode();
			while (temp != 0) {
				int t = temp % 10;
				ListNode node = new ListNode(t);
				if (next == null) {
					next = node;
					p = next;
				} else {
					p.setNext(node);
					p = p.getNext();
				}

				temp = temp / 10;
			}
		}
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

}