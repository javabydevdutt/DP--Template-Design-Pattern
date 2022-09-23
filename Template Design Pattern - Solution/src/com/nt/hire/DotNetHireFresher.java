package com.nt.hire;

public class DotNetHireFresher extends HireFresher {

	@Override
	public boolean conductTechnicalTest() {
		System.out.println("DotNet conducting Technical Test");
		return true;
	}

	@Override
	public boolean conductSystemTest() {
		System.out.println("Dotnet conducting system test");
		return true;
	}

}
