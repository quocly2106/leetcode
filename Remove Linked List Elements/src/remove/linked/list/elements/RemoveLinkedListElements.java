/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package remove.linked.list.elements;

import com.sun.net.httpserver.Headers;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode button = new ListNode(0);
        button.next = head;
        ListNode current = button;
        while (current.next != null) {            
           if(current.next.val == val){
               current.next = current.next.next;
           } else{
               current = current.next;
           }
        }
        return button.next;
        
    }
    public static void main(String[] args) {
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;
        
        RemoveLinkedListElements solution = new RemoveLinkedListElements();
        ListNode LastList =solution.removeElements(head, val);
        
        printList(LastList);
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
    
}
