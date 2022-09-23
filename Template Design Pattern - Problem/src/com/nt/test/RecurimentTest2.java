package com.nt.test;

import com.nt.hire.DotNetHireFresher;
import com.nt.hire.HireFresher;

public class RecurimentTest2 {

	public static void main(String[] args) {
		HireFresher fresher = null;
		boolean result = false;
		// create the object
		fresher = new DotNetHireFresher();
		result = fresher.conductApptitudeTest();
		if (result)
			result = fresher.conductGD();
		if (result)
			result = fresher.conductTechnicalTest();
		if (result)
			result = fresher.conductSystemTest();
		if (result)
			result = fresher.conductHR();

		if (result) {
			System.out.println("U are selected for Dotnet developer");
		} else {
			System.out.println("U are not selected for DotNet developer");
		}
	}// main

}// class
