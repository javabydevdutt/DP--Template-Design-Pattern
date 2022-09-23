package com.nt.test;

import com.nt.hire.HireFresher;
import com.nt.hire.JavaHireFresher;

public class RecurimentTest1 {

	public static void main(String[] args) {
		HireFresher fresher=null;
		boolean result=false;
		//create the object
		fresher=new JavaHireFresher();
		result=fresher.conductApptitudeTest();
		if(result)
			result=fresher.conductGD();
		if(result)
			result=fresher.conductTechnicalTest();
		if(result)
			result=fresher.conductSystemTest();
		if(result)
			result=fresher.conductHR();
		
		if(result) {
			System.out.println("U are selected for java developer");
		}
		else {
			System.out.println("U are not selected for java developer");
		}
	}//main

}//class
