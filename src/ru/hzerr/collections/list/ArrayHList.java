package ru.hzerr.collections.list;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class ArrayHList<E> extends ArrayList<E> implements HList<E> {

    public ArrayHList() { super(); }
    public ArrayHList(int initialCapacity) { super(initialCapacity); }
    public ArrayHList(Collection<? extends E> collection) { super(collection); }

    @Override
    public boolean noContains(E element) { return !contains(element); }

    @Override
    public boolean contains(Predicate<E> predicate) {
        //noinspection unchecked
        for (E element : (E[]) this.toArray()) {
            if (predicate.test(element)) {
                return true;
            }
        }

        return false;
    }

    @Override
    @SafeVarargs
    @SuppressWarnings("ManualArrayToCollectionCopy")
    public final void add(E... elements) {
        for (E element : elements) {
            super.add(element);
        }
    }

    @SafeVarargs
    public static <E> ArrayHList<E> create(@NotNull E... elements) {
        return new ArrayHList<>(Arrays.asList(elements));
    }
}
