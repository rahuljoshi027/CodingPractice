package com.temp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.sun.javafx.scene.control.behavior.OptionalBoolean;


interface interf{
	
	void print(int a);
}

interface interf1{
	
	void print(int a);
}


class Person{
	
	String fName,lName;
	
	Person(){}
	
	Person(String f,String l){
		fName = f;
		lName = l;
	}
	
}


public class LambdaExecise {

	public static void main(String[] args) {
		
		List<Person> l = Arrays.asList(
				new Person("Chales","Dickson"),
				new Person("Lewis","Carol"),
				new Person("Thomas","Edison"),
				new Person("Charlotte","Bronte"),
				new Person("Mathew","Arnold")
				);
		Integer intr =0;
		intr = 3;
		intr.
		System.out.println(" intr "+intr);
		l.forEach(null);
		l.stream();
		l.stream();
		List<Integer> l1 = null;
		IntSummaryStatistics ls = l1.stream().collect(Collectors.summarizingInt(null));
		int i=1;
		interf i1 = x->System.out.println(x);
		interf1 i2 = x->System.out.println(x);
		
		i1 = (interf) i2 ;
		String s = new String("hi");
		Optional<String> o = Optional.of(s);
		Map<String,String> m = new HashMap<String,String>();
		Comparable<String> c1 = new Comparable<String>() {
			
			@Override
			public int compareTo(String arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Comparator<String> cx = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		Comparator<Person> cs = (p1,p2)->p1.lName.compareTo(p2.lName); 
			Function<String,String> fun = (x)->{
				int abc =1;System.out.println(abc);
				return x ;};
		Collections.sort(l, (p1,p2)->p1.lName.compareTo(p2.lName));
		Consumer<Person> c = x-> System.out.println("Person "+x.lName+" "+x.fName);
		Function<Person, String> f = p -> p.fName;
		for(Person p:l) {
			
			c.accept(p);
		}
		
		for(Person p:l) {
			Predicate<Person> pr = x-> x.lName.startsWith("C");
			if(pr.test(p))
			c.accept(p);
		}
		System.out.println(" function : "+f.apply(l.get(0)));
		
	}
	


}
