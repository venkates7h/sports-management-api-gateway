package com.sports.services.gateways;

public class SingletonSample {

	private static volatile SingletonSample obj = null;

	private SingletonSample() {
	}

	public static SingletonSample getInstance() {
		if (obj == null)
			synchronized (SingletonSample.class) {
				if (obj == null) {
					obj = new SingletonSample();
				}
			}
		return obj;

	}

}

class Employee {

	public static void main(String[] args) {

		SingletonSample sample1 = SingletonSample.getInstance();
		SingletonSample sample2 = SingletonSample.getInstance();

		if (sample1.equals(sample2))
			System.out.println("both are");

	}
}