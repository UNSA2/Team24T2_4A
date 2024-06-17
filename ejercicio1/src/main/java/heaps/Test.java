package heaps;

public class Test {
    public static void main(String[] args) {
        PriorityQueueHeap<String> myHeap = new PriorityQueueHeap<String>();
        
        System.out.println(myHeap);
        myHeap.enqueue("Juan", 5);
        System.out.println(myHeap);
        myHeap.enqueue("Maria", 10);
        System.out.println(myHeap);
        myHeap.enqueue("Anelhi", 12);
        System.out.println(myHeap);
        myHeap.enqueue("Angely", -6);
        System.out.println(myHeap);
        myHeap.enqueue("Marina", 8);
        System.out.println(myHeap);
        myHeap.enqueue("Johan", 17);
        System.out.println(myHeap);
        myHeap.enqueue("Aaron", -9);
        System.out.println(myHeap);
        myHeap.enqueue("Mylen", 2);
        System.out.println(myHeap);
        myHeap.enqueue("Albieri", 35);
        System.out.println(myHeap);

        System.out.println(myHeap.front());
        System.out.println(myHeap.back());

        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
        
        System.out.println(myHeap.front());
        System.out.println(myHeap.back());
    }
}
