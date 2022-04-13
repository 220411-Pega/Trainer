package com.revature.app;

/*
 * Encapsulation is using access modifiers to hide data and methods where they should not be used
 * in order to allow other developers to infer how to (or not to use) use some library, package, etc
 * 
 * We have a main tool, access modifiers, for implementing encapsulation. There are four modifiers:
 * 1. private, which means "visible only within the owning class"
 * 2. protected, which means "visible to the owning class, any classes in its package, and any child classes,
 *     regardless of package"
 * 3. default (no modifier), which means "visible only other classes in the same package"
 * 4. public, which means "always visible"
 * 
 *               Same class        Child class, ext package      Same package       Everything else
 * private         Yes                   No                           No                 No
 * default         Yes                   No                           Yes                No
 * protected       Yes                   Yes                          Yes                No
 * public          Yes                   Yes                          Yes                Yes 
 */
public class Driver {

	
}
