package heaps;

public class Test {
    public static void main(String[] args) {
        TDAHeap<Integer> myHeap = new TDAHeap<Integer>();
        
        System.out.println(myHeap);
        myHeap.enqueue(5);
        System.out.println(myHeap);
        myHeap.enqueue(10);
        System.out.println(myHeap);
        myHeap.enqueue(12);
        System.out.println(myHeap);
        myHeap.enqueue(-6);
        System.out.println(myHeap);
        myHeap.enqueue(8);
        System.out.println(myHeap);
        myHeap.enqueue(17);
        System.out.println(myHeap);
        myHeap.enqueue(-9);
        System.out.println(myHeap);
        myHeap.enqueue(2);
        System.out.println(myHeap);
        myHeap.enqueue(35);
        System.out.println(myHeap);

        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
        System.out.println(myHeap.dequeue());
        System.out.println(myHeap);
    }
}
