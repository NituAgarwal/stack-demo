package com.stack.project.model;

public class SingleLinkedList<T> {
    T value;
    SingleLinkedList next;

    public SingleLinkedList(){
        this.value = null;
    }

    public SingleLinkedList(T value){
        this.value = value;
        this.next = null;
    }
}
