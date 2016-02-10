package com.javadoc;

public class OrderedPair<K, V> implements Pair<K, V> {

	private K key;

	private V value;

	public OrderedPair(K key, V value) {

		this.key = key;
		this.value = value;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	public static void main(String[] args) {

		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);

		Pair<String, String> p2 = new OrderedPair<String, String>("Hello",
				"World");

		System.out.println(p1);
		System.out.println(p2);

	}

}
