package com.github.javacodekata.lambda.stream;

import com.google.common.collect.ImmutableList;

import java.util.LinkedList;
import java.util.List;

import static com.google.common.base.Preconditions.checkNotNull;

public class ListTransformer {

	private final List<String> values;

	private ListTransformer(List<String> values) {
		this.values = values;
	}

	public static ListTransformer of(List<String> values) {
		checkNotNull(values);
		return new ListTransformer(ImmutableList.copyOf(values));
	}

	public List<String> getSortedStrings() {
		return values;
	}

	public List<Integer> getSortedIntegers() {
		return new LinkedList<>();
	}

	public List<Integer> getSortedDescendingIntegers() {
		return new LinkedList<>();
	}

}
