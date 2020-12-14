package ru.hzerr.collections.map;

import java.util.function.Predicate;

public interface Contender<K, V> {

    boolean containsKey(Predicate<K> predicate);
    boolean containsValue(Predicate<V> predicate);
}
