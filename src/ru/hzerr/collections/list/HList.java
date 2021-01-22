package ru.hzerr.collections.list;

import java.util.List;

public interface HList<E> extends List<E>, Contender<E> {

    @SuppressWarnings("unchecked")
    void add(E... elements);
}
