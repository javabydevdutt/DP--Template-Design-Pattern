package com.nt.factory;

import com.nt.hire.DotNetHireFresher;
import com.nt.hire.HireFresher;
import com.nt.hire.JavaHireFresher;

public class HireFresherFactory {

	public static HireFresher getInstance(String domain) {
		HireFresher fresher = null;
		if (domain.equalsIgnoreCase("java")) {
			fresher = new JavaHireFresher();
		} else if (domain.equalsIgnoreCase("dotnet")) {
			fresher = new DotNetHireFresher();
		} else {
			throw new IllegalArgumentException("Invalid Domain name");
		}
		return fresher;
	}
}
