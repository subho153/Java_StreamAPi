package com.java.practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Subho Ghosh","Deep das","Ajay","Amit","Dilip");
		List<String> longnames=new ArrayList<String>();
		longnames=names.stream().filter(str->str.length()>6 && str.length()<10).collect(Collectors.toList());
		System.out.println(longnames);
		
		
	}

}
