package com.nt.hire;

public abstract class HireFresher {

	public boolean conductApptitudeTest() {
		System.out.println("conducting Apptitude Test");
		return true;
	}

	public boolean conductGD() {
		System.out.println("Conducting Grop Disscussion");
		return true;
	}

	public boolean conductHR() {
		System.out.println("Condcuting HR inteviwew");
		return true;
	}

	public abstract boolean conductTechnicalTest();

	public abstract boolean conductSystemTest();

}
