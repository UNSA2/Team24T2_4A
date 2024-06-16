package ejercicio_2;
public class Node<K, V> {
    private K key;
    private V value;
    private int height;
    private Node<K, V> left, right;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.height = 1;
    }

    public K    getKey() {return key;}
    public void setKey(K key) {this.key = key;}
    public V    getValue() {return value;}
    public void setValue(V value) {this.value = value;}

    public int  getHeight() {return height;}
    public void setHeight(int height) {this.height = height;}

    public Node<K, V> getLeft() {return left;}
    public void       setLeft(Node<K, V> left) {this.left = left;}
    public Node<K, V> getRight() {return right;}
    public void       setRight(Node<K, V> right) {this.right = right;}
}