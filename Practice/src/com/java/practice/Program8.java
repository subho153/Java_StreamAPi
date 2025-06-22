package com.java.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program8 {

	public static void main(String[] args) {
		
		List<Integer> number=Arrays.asList(12,67,-100,0,8991,200,24589);
		List<Integer> result=new ArrayList<Integer>();
		
		Integer result1=number.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(result1);
		
		Integer result2=number.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(result2);
	}
}
