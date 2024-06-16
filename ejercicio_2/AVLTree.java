package ejercicio_2;

public class AVLTree<K extends Comparable<K>, V> extends BST<K, V> {

    protected Node<K, V> insertRec(Node<K, V> node, K key, V value) {
        node = super.insertRec(node, key, value);
        return balance(node);
    }

    protected Node<K, V> removeRec(Node<K, V> node, K key) {
        node = super.removeRec(node, key);
        if (node != null) {
            node = balance(node);
        }
        return node;
    }

    private Node<K, V> balance(Node<K, V> node) {
        updateHeight(node);
        int balanceFactor = getBalance(node);

        if (balanceFactor > 1) {
            if (getBalance(node.getLeft()) < 0) {
                node.setLeft(rotateLeft(node.getLeft()));
            }
            return rotateRight(node);
        }

        if (balanceFactor < -1) {
            if (getBalance(node.getRight()) > 0) {
                node.setRight(rotateRight(node.getRight()));
            }
            return rotateLeft(node);
        }

        return node;
    }

    private void updateHeight(Node<K, V> node) {
        node.setHeight(1 + Math.max(height(node.getLeft()), height(node.getRight())));
    }

    private int height(Node<K, V> node) {
        return node == null ? 0 : node.getHeight();
    }

    private int getBalance(Node<K, V> node) {
        return node == null ? 0 : height(node.getLeft()) - height(node.getRight());
    }

    private Node<K, V> rotateRight(Node<K, V> y) {
        Node<K, V> x = y.getLeft();
        Node<K, V> T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private Node<K, V> rotateLeft(Node<K, V> x) {
        Node<K, V> y = x.getRight();
        Node<K, V> T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        updateHeight(x);
        updateHeight(y);

        return y;
    }
}
