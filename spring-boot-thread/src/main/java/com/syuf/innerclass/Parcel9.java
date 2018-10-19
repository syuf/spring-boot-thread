package com.syuf.innerclass;

public class Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class:
	public Destination destination(final String dest) {
		System.out.println(1);
		return new Destination() {
			
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
		Destination d2 = p.destination("Tasmania2");
	}
} /// :~
