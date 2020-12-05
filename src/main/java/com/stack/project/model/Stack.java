package com.stack.project.model;

public class Stack<T> {
    int capacity;
    SingleLinkedList head;
    int size;

    public Stack(int capacity){
        this.capacity = capacity;
        head = new SingleLinkedList();
        head.next = null;
        this.size = 0;
    }


    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public T pop(){

        if(isEmpty()){
            System.out.println("Empty Stack");
            return null;
        }
        this.size--;
        SingleLinkedList popNode = head;
        head = head.next;
        return (T) popNode.value;
    }

    public void push(T value) {
        if(size == capacity){
            return;
        }
        this.size++;
        SingleLinkedList next = head;
        // Add at head of List
        head = new SingleLinkedList(value);
        head.next = next;
    }

    public T peek(){
        System.out.println(head.value);
        return head.value == null ? null: (T)head.value;
    }

    public boolean isEmpty(){
        return head.value == null;
    }

}
