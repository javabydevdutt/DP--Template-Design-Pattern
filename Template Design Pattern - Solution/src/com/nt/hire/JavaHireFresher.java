package com.nt.hire;

public class JavaHireFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("Java conduct Technical Test");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("Java conduct System Test");
		return true;
	}

}
