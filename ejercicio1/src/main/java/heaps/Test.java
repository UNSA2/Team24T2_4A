package heaps;

public class Test {
    public static void main(String[] args) {
        PriorityQueueHeap<String> myHeap = new PriorityQueueHeap<String>();
        
        System.out.println(myHeap);
        myHeap.enqueue("str1", 5);
        System.out.println(myHeap);
        myHeap.enqueue("str2", 10);
        System.out.println(myHeap);
        myHeap.enqueue("str3", 12);
        System.out.println(myHeap);
        myHeap.enqueue("str4", -6);
        System.out.println(myHeap);
        myHeap.enqueue("str5", 8);
        System.out.println(myHeap);
        myHeap.enqueue("str6", 17);
        System.out.println(myHeap);
        myHeap.enqueue("str7", -9);
        System.out.println(myHeap);
        myHeap.enqueue("str8", 2);
        System.out.println(myHeap);
        myHeap.enqueue("str9", 35);
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
