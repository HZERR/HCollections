package ru.hzerr.collections.list;

import java.util.function.Predicate;

public interface Contender<E> {

    boolean noContains(E element);

    boolean contains(Predicate<E> predicate);
}
