package org.dencik_incorporated;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class CustomSet<T>{
    private Set<T> values;

    public CustomSet() {
        this.values = new HashSet<T>();
    }

    public void add (T value) {
        values.add(value);
    }

    public void forEach(Consumer<? super T> consumer) {
        for (T value : this.values) {
            consumer.accept(value);
        }

    }
}
