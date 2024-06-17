package heaps;

import java.util.ArrayList;

public class PriorityQueueHeap<E extends Comparable<E>> extends TDAHeap<HeapNode<E>> {

    public PriorityQueueHeap(){
        this.setData(new ArrayList<HeapNode<E>>());
    }

    public void enqueue(E x, int priority){
        HeapNode<E> newNode = new HeapNode<E>(x, priority);
        super.enqueue(newNode);
    }

    public HeapNode<E> dequeue(){
        return super.dequeue();
    }

    public HeapNode<E> front(){
        return super.front();
    }

    public HeapNode<E> back(){
        return super.back();
    }

    public String toString(){
        return super.toString();
    }
}
