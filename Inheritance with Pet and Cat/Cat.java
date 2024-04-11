package Mod2Package;

// Class that, in tandem with the Pet class, allows the user to check their cat in for boarding.

public class Cat extends Pet { // The "extends" keyword allows Cat to inherit from Pet, which will be further implemented later.
	private int catSpaceNumber; // This is a private field for Cat that initializes it as an integer.
	
	public Cat() { // The default constructor Cat() initializes the field with a default value.
		catSpaceNumber = -1;
	}
	
	public Cat(int updatedCatSpaceNumber) { // The overloaded constructor Cat(...) requires a parameter to set the field to an integer value.
		catSpaceNumber = updatedCatSpaceNumber;
	}
	
	public int getCatSpaceNumber() { // This is an accessor that "gets" or returns the value of a field.
		return catSpaceNumber;
	}
	
	public void setCatSpaceNumber(int updatedCatSpaceNumber) { // This is a mutator that "sets" or assigns the value of a field.
		this.catSpaceNumber = updatedCatSpaceNumber; // "this." is used here to indicate the variable is coming from the Cat class.
	}
}
