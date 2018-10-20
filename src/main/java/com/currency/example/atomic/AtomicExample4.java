package com.currency.example.atomic;

import java.util.concurrent.atomic.AtomicReference;

import com.currency.annotation.ThreadSafe;

@ThreadSafe
public class AtomicExample4 {

	private static AtomicReference<Integer> count = new AtomicReference<>(0);
	
	public static void main(String[] args) {
		count.compareAndSet(0, 2);
		count.compareAndSet(0, 1);
		count.compareAndSet(1, 3);
		count.compareAndSet(2, 4);
		count.compareAndSet(3, 5);
		System.out.println("count{}: " + count.get());
	}
}
