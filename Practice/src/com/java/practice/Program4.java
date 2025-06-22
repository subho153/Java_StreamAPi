package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {
	public static void main(String[] args) {
	
		List<String> list=Arrays.asList("Subho","Amit","Ajay","Swrap");
		List<String> uppercaselist=new ArrayList<String>();
		List<String> lowercaselist=new ArrayList<String>();
		uppercaselist=list.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercaselist);
		
		lowercaselist=list.stream().map(n->n.toLowerCase()).collect(Collectors.toList());
		System.out.println(lowercaselist);
		
		
	}
}
