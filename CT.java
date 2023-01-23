public class CT extends Vehicle {
	private int seating;
	private int hauling;
	private boolean isCombination;
	
	public void setSeating(int in){
		seating = in;
	}
	
	public int getSeating(){
		return seating;
	}
	
	public void setHauling(int in){
		hauling = in;
	}
	
	public int getHauling(){
		return hauling;
	}
	public void setIsCombination(boolean in){
		isCombination = in;
	}
	
	public boolean getIsCombination(){
		return isCombination;
	}
	
	//The parent class also has an identically named method, this method used in this subclass will OVERRIDE its parents stats() method when called from an object of this subclass. 
	//This is polymorphism(many shapes)
	public void stats(){
		System.out.println("Vehicle class: " + vclass);
		System.out.println("Commercial Truck model name: " + make);
		System.out.println("Commercial Truck model name: " + model);
		System.out.println("Commercial Truck model year: " + year);
		System.out.println("Commercial Truck weight is: " + weight);
		System.out.println("Commercial Truck color is: " + color);
		System.out.println("Commercial Truck EPA rated MPG: " + mpg);
		System.out.println("Commercial Truck seating capacity: " + seating); //extra line of output to show the extra datafield
		System.out.println("Commercial Truck hauling capacity: " + hauling);
		System.out.println("Is Combonation Vehicle: " + isCombination); //extra line of output to show the extra datafield
		System.out.println(notes);
		
		
	}
	
	
}