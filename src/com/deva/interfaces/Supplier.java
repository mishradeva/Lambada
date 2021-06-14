package com.deva.interfaces;

import java.util.Objects;

@FunctionalInterface
public interface Supplier<T> {
	T get();

}
