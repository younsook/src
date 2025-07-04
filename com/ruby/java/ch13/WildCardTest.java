package com.ruby.java.ch13;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inum = {1, 2, 3, 4, 5};
		Double[] dnum = {1.0, 2.0, 3.0, 4.0, 5.0};
		String[] snum = {"1", "2", "3", "4", "5"};
		
		List<Integer> iList = Arrays.asList(inum);
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);
		
		double isum = sum(iList);
		double dsum = sum(dList);
//		sum(sList); //오류발생
		
		System.out.println("inum의 합계 : "+isum);
		System.out.println("dnum의 합계 : "+dsum);
		
		
	}

	public static double sum(List<? extends Number> list) {
		double total = 0;
		for(Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
	


}
