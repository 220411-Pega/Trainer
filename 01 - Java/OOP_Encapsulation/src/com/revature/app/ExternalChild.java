package com.revature.app;

import com.revature.otherpackage.Parent;

public class ExternalChild extends Parent {

	public void testVisibility() {
		//privateInt = 1; // Never visible
		protectedInt = 16; // Visible due to being a child class of Parent
		//defaultInt = 8; // Not visible because packages are different
		publicInt = 9; // Always visible;
	}
}
