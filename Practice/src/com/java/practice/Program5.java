package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {
	public static void main(String args[]) {
		
		List<Integer> list=Arrays.asList(23,67,89,11,12,78,60,58);
		List<Integer> aftermultiplelist=new ArrayList<>();
		aftermultiplelist=list.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(aftermultiplelist);
	}

}
