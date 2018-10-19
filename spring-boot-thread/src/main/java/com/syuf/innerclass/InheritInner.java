package com.syuf.innerclass;

class WithInner {
	WithInner(){
		System.out.println(2);
	}
	class Inner {
		Inner(){
			System.out.println(3);
		}
		void say() {
			System.out.println(1);
		}
	}
}

public class InheritInner extends WithInner.Inner {
	// ! InheritInner() {} // Won't compile
	
	InheritInner(WithInner wi) {
		wi.super();
		System.out.println(4);
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
		ii.say();
	}
} /// :~
