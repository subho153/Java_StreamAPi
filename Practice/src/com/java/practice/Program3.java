package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {
		List<String> list=Arrays.asList(null,"Subho","Jay","Amit","Ajay","Sumit");
		List<String> word=new ArrayList<String>();
		
		word=list.stream().filter(n->n!=null).collect(Collectors.toList());
		System.out.println(word);
				
	}
}
