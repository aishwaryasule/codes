package com.bridgelabz.functional;

import java.util.*;

public class linklist {
static class Node {
int data;
Node next;

Node(int d) {
this.data = d;
this.next = null;
}
}

Node head = null;
Node tail = null;

public void insertatfirst(int data) {
Node newnode = new Node(data);
if (head == null) {
head = newnode;

} else {
Node temp = head;
head = newnode;
head.next = temp;
}

}

public void insertatmid(int data) {

if (head == null) {
head = new Node(data);
}

else {
Node newnode = new Node(data);
Node slow = head;
Node fast = head.next;

while (fast != null && fast.next != null) {
slow = slow.next;
fast = fast.next.next;
}
newnode.next = head;
slow.next = newnode;
}

}

public void insertatlast(int data) {  
       
        Node newNode = new Node(data);  
 
       
        if(head == null) {  
           
            head = newNode;  
            tail = newNode;  
        }  
        else {  
           
            tail.next = newNode;  
           
            tail = newNode;  
        }  
    }  

void display() {
Node current = head;
while (head == null) {
System.out.println("list is empty");
return;

}

current = head;
System.out.println("adding nodes into linklist");
while (current != null) {
System.out.print(current.data + "");
current = current.next;
}
System.out.println();
}

public static void main(String args[]) {
linklist list1 = new linklist();
list1.head = new Node(10);
list1.head.next = new Node(20);
list1.head.next.next = new Node(30);
System.out.println("List is:");
list1.display();


// list1.insertatfirst(50);
// System.out.println("After inserting 1stList is:");
        // list1.display();
//list1.insertatmid(50);
// System.out.println("After inserting mid List is:");
//list1.display();
 System.out.println("After inserting last List is:");
 list1.insertatlast(40);
 list1.display();


}
}
           
