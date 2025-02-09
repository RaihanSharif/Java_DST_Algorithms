package generics;

// a simple key, value pair using generics
public class Pair<K, V> {
    K key;
    V value;

    public void set(K k, V v) {
        key = k; value = v;
    }
    public K getKey() { return key; }

    public V getValue() { return value; }

    @Override
    public String toString() {
        return "[" + getKey() + ", " + getValue() + "]";
    }
}
