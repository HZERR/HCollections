package ru.hzerr.collections.list;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayHList<E> extends ArrayList<E> implements HList {

    public ArrayHList() { super(); }
    public ArrayHList(int initialCapacity) { super(initialCapacity); }
    public ArrayHList(Collection<? extends E> collection) { super(collection); }

    @SafeVarargs
    public static <E> ArrayHList<E> create(@NotNull E... elements) {
        return new ArrayHList<>(Arrays.asList(elements));
    }
}
