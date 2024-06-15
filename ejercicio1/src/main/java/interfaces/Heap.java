package interfaces;

interface Heap<T extends Comparable<T>> {
    void enqueue(T x);
    T dequeue();
    T front();
    T back();
}