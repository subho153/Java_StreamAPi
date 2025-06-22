package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program2 {
	public static void main(String[] args) {
		List<Integer> numlist=Arrays.asList(90,88,74,51,21,91,99,101,15671,163);
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();
		
		even=numlist.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(even+"\t");
		
		odd=numlist.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(odd+"\t");
		
		
	}

}
