package com.nt.test;

import com.nt.factory.HireFresherFactory;
import com.nt.hire.HireFresher;

public class RecurimentTest2 {

	public static void main(String[] args) {
		HireFresher fresher = HireFresherFactory.getInstance("dotnet");
		boolean result = fresher.recurimentProcess();
		if (result) {
			System.out.println("U are selected for Dotnet developer");
		} else {
			System.out.println("U are not selected for DotNet developer");
		}
	}// main

}// class
