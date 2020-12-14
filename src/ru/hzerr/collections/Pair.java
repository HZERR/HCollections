package ru.hzerr.collections;

public class Pair<K, V> {

    private final K key;
    private final V value;

    public Pair(K key, V value) { this.key = key; this.value = value; }

    public K getKey() { return this.key; }
    public V getValue() { return this.value; }

    public static <K, V> Pair<K, V> create(K key, V value) { return new Pair<>(key, value); }
}
