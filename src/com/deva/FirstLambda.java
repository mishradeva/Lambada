package com.deva;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FirstLambda {

	public static void main(String[] args) {
		Supplier<String> sup= () -> "Hello!";
		System.out.println(sup.get());
		
		
		Consumer<String> con=(String s) -> System.out.println(s);
		con.accept("This is ");

	}

}
