package ru.hzerr.collections.list;

import ru.hzerr.HStream;

import java.util.List;

public interface HList<E> extends List<E>, Contender<E> {

    @SuppressWarnings("unchecked")
    void add(E... elements);

    @SuppressWarnings("unchecked")
    void setAll(E... elements);

    // v1.1
    HStream<E> toHStream();
}
