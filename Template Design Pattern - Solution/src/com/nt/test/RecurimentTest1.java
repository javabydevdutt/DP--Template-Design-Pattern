package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hire.HireFresher;

public class RecurimentTest1 {

	public static void main(String[] args) {
		HireFresher fresher = HireFresherFactory.getInstance("java");
		boolean result = fresher.recurimentProcess();
		if (result) {
			System.out.println("U are selected for java developer");
		} else {
			System.out.println("U are not selected for java developer");
		}
	}// main

}// class
