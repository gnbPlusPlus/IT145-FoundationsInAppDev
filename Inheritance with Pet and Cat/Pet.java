package Mod2Package;

// Class that sets up Dog and Cat classes for user functionality.

public class Pet {
	// These are private fields with their corresponding data types.
	private String petType;
	private String petName;
	private int petAge;
	private int dogSpaces;
	private int catSpaces;
	private int daysStay;
	private double amountDue;
	
	public Pet() { // The default constructor initializes all fields.
		petType = "none";
		petName = "NoName";
		petAge = -1;
		dogSpaces = -1;
		catSpaces = -1;
		daysStay = -1;
		amountDue = -1.00;
	}
	
	// The overloaded constructor requires parameters to set all fields to desired values at once.
	public Pet(String userPetType, String userPetName, int userPetAge, int updatedDogSpaces,
			   int updatedCatSpaces, int userDaysStay, double userAmountDue) {
		petType = userPetType;
		petName = userPetName;
		petAge = userPetAge;
		dogSpaces = updatedDogSpaces;
		catSpaces = updatedCatSpaces;
		daysStay = userDaysStay;
		amountDue = userAmountDue;
	}
	
	public String getPetType() { // This is an accessor that "gets" the value of a field.
		return petType;
	}
	
	public void setPetType(String userPetType) { // This is a mutator that "sets" the value of a field.
		this.petType = userPetType; // "this." is used here and elsewhere to indicate the variables are coming from the Pet class.
	}
	
	public String getPetName() { // Accessor

		return petName;
	}
	
	public void setPetName(String userPetName) { // Mutator
		this.petName = userPetName;
	}
	
	public int getPetAge() { // Accessor
		return petAge;
	}
	
	public void setPetAge(int userPetAge) { // Mutator
		this.petAge = userPetAge;
	}
	
	public int getDogSpaces() { // Accessor
		return dogSpaces;
	}
	
	public void setDogSpaces(int updatedDogSpaces) { // Mutator
		this.dogSpaces = updatedDogSpaces;
	}
	
	public int getCatSpaces() { // Accessor
		return catSpaces;
	}
	
	public void setCatSpaces(int updatedCatSpaces) { // Mutator
		this.catSpaces = updatedCatSpaces;
	}
	
	public int getDaysStay() { // Accessor
		return daysStay;
	}
	
	public void setDaysStay(int userDaysStay) { // Mutator
		this.daysStay = userDaysStay;
	}
	
	public double getAmountDue() { // Accessor
		return amountDue;
	}
	
	public void setAmountDue(double userAmountDue) { // Mutator
		amountDue = userAmountDue;
	}
}

