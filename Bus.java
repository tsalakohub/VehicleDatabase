public class Bus extends Vehicle {
	private int seating;
	
	
	public void setSeating(int in){
		seating = in;
	}
	
	public int getSeating(){
		return seating;
	}
	
	//The parent class also has an identically named method, this method used in this subclass will OVERRIDE its parents stats() method when called from an object of this subclass. 
	//This is polymorphism(many shapes)
	public void stats(){
		System.out.println("Vehicle class: " + vclass);
		System.out.println("Bus model name: " + make);
		System.out.println("Bus model name: " + model);
		System.out.println("Bus model year: " + year);
		System.out.println("Bus weight is: " + weight);
		System.out.println("Bus color is: " + color);
		System.out.println("Bus EPA rated MPG: " + mpg);
		System.out.println("Bus seating capacity: " + seating); //extra line of output to show the extra datafield
		System.out.println(notes);
		
		
	}
	
	
}