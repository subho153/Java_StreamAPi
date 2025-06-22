package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program7 {
	public static void main(String [] args) {
		
		List<String> names=Arrays.asList("Subho", "Ajay","Amit","Dipankar","Mounika");
		List<String> newnames=new ArrayList<String>();
		newnames=names.stream().filter(x->x.startsWith("S")).collect(Collectors.toList());
		System.out.println(newnames);
		
		List<Integer> number=Arrays.asList(2,67,89,0,-1,119,21,1,-100);
		List<String> result=new ArrayList<String>();
		number.stream().sorted().forEach(System.out::println);
		
	}
}
