public class Motorcycle extends Vehicle {
    public void setWeight(int in){
		if (in < 200 && in > 500)
		{
			notes += "The user entered an invalid weight of " + in + " as a weight \n";
		}
		weight = in;
    }
	public int getWeight(){
		return weight;
    }
    
    public void stats(){
		System.out.println("Motorcycle make name: " + make);
        System.out.println("Motorcycle model name: " + model);
		System.out.println("Motorcycle model year: " + year);
		System.out.println("Motorcycle weight is: " + weight);
		System.out.println("Motorcycle color is: " + color);
		System.out.println("Motorcycle EPA rated MPG: " + mpg);
		System.out.println(notes);
	}
}
     