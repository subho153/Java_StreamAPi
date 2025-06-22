package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program6 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Subho Ghosh","Jeep","Ajay","Suman","Akash");
		List<Integer> newlist=new ArrayList<>();
		newlist=names.stream().map(n->n.length()).collect(Collectors.toList());
		System.out.println(newlist);
	}

}
