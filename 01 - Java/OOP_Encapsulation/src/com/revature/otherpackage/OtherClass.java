package com.revature.otherpackage;

public class OtherClass {

	public void testVisibility() {
		Parent p = new Parent();
		//p.privateInt = 9; // Never visible
		p.protectedInt = 6; // Visible because this class shares a package with Parent
		p.defaultInt = 7; // Also visible because of package
		p.publicInt = 9; // Always visible
	}
}
