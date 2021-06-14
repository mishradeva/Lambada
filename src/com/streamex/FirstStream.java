package com.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.streamex.Person;

public class FirstStream {

	public static void main(String[] args) {

		
		Person p1=new Person("X1",20);
		Person p2=new Person("X2",50);
		Person p3=new Person("X3",30);
		Person p4=new Person("X4",25);
		Person p5=new Person("X5",29);
		Person p6=new Person("X6",28);
		Person p7=new Person("X7",27);
		Person p8=new Person("X8",35);
		
		List<Person> people=Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8);
		
		Person[] people1= {p1,p2,p3,p4,p5};
		long count= Stream.of(people1).count();
		System.out.println(count);
		
		Arrays.stream(people1).forEach(System.out::println);


	}

}
