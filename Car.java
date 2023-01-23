public class Car extends Vehicle {
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
		System.out.println("Car make name: " + make);
        System.out.println("Car model name: " + model);
		System.out.println("Car model year: " + year);
		System.out.println("Car weight is: " + weight);
		System.out.println("Car color is: " + color);
		System.out.println("Car EPA rated MPG: " + mpg);
		System.out.println("Car seating capacity: " + seating); //extra line of output to show the extra datafield
		System.out.println(notes);
		
		
	}
	
	
}