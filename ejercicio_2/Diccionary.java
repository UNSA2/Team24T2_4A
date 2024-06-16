package ejercicio_2;


public interface Diccionary< K, V> {
    void insert(K key, V value);
    V search(K key);
    void remove(K key);
    boolean isEmpty();
}
