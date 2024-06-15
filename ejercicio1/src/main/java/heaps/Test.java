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
    }
}
