public class Vehicle {
	//these variables are part of the public class itself but are protected meaning they cant be directly seen or accessed by a program making a Vehicle object, they are using "data hiding"
	// to access or set these we will need to make an INTERFACE to the class, ie public methods to get and set them - java calls this practice "getters and setters"
	protected String vclass = "";
	protected String make = "";
	protected String model = "";
	protected int weight = 0;
	protected String color = "";
	protected double mpg = 0.0;
	protected int year = 0000;
	protected String notes = "System notes: \n";
	//Constructor allow us to create an OBJECT instance of our class in various ways
	
	//This is our base constructor, it will just allow an object to be created with a 'new Vehicle()' command. To set the datafields we will need to call the methods ourself.
	public Vehicle(){
	}
	// This is also a constructor of the same name but declared differently with an ability to take in parameters. This is 'Constructor Overloading'
	public Vehicle(String vclass,String make,String model,int weight,String color,double mpg,int year){
		//This constructor can take in all the needed info for a car to be defined in the line declaring the object. It will call the setters.
		// we could access the data fields above directly 'mpg = inmpg;' for example, but we would like to still apply our datahiding rules
		setVClass(vclass);
		setMake(make);
		setModel(model);
		setWeight(weight);
		setColor(color);
		setMPG(mpg);
		setYear(year);
	}
	
	public void setVClass(String vclass){
		this.vclass = vclass.toUpperCase();
	}
	public String getVClass(){
		return this.vclass;
	}
	public void setMake(String make){
		this.make = make.toUpperCase();
	}
	public String getMake(){
		return this.make;
	}
	
	public void setModel(String model){
		//setter methods usually are VOID datatype as they only act to take in a value without giving anything back
		// what if I need to make sure model names are stored as uppercase only? If I make the data fields public I cant enforce a rule like that. By hiding the data and using an interface i can
		this.model = model.toUpperCase();
	}
	
	public  String getModel(){
		//getters datatype for the method needs to match the datatype of the field it will return
		//notice it isnt taking IN any parameters? It doesnt need to for this case
		return this.model;
		
	}
	
	public  void setWeight(int weight){
		// enforce a rule that a weight below 1000 is invalid and notify through the 'notes' field above the weight entered was invalid
		if (weight < 1000)
		{
			notes += "The user entered an invalid weight of " + weight + " as a weight \n";
		}
		this.weight = weight;
		
		
	}
	public  int getWeight(){
		return this.weight;
	}
	public  void setColor(String color){
		this.color = color.toUpperCase();;
	}
	public  String getColor(){
		return this.color;
	}
	
	public  void setYear(int year){
		//make sure year isnt prior to 1930 or notify in notes an invalid year was entered
		if (year < 1930)
		{
			notes += "The user entered an invalid year of " + year +  " for vehicle model year\n";
		}
		this.year = year;
		
	}
	public  int getYear(){
		return this.year;
	}
	public  void setMPG(double mpg){
		this.mpg = mpg;
	}
	public  double getMPG(){
		return this.mpg;
	}
	
	
	public void stats(){
		System.out.println("Vehicle class: " + vclass);
		System.out.println("Vehicle make name: " + make);
		System.out.println("Vehicle model name: " + model);
		System.out.println("Vehicle model year: " + year);
		System.out.println("Vehicle weight is: " + weight);
		System.out.println("Vehicle color is: " + color);
		System.out.println("Vehicle EPA rated MPG: " + mpg);
		System.out.println(notes);
		
		
	}
	
	
	
	
	
	
}