import java.util.*;
import java.io.*;
public class Fleet{
    public static void main(String[] args) throws Exception{
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the name of your vehicle database file");
        String db = kbd.next();
        Scanner DBread = new Scanner(new File(db));

       while (DBread.hasNext()) {
			
			String VC = DBread.next();
			
			if (VC.equals("C")) {
				Car mycar = new Car();
				mycar.setVClass("C");
				mycar.setMake(DBread.next());
				mycar.setModel(DBread.next());
				mycar.setWeight(DBread.nextInt());
				mycar.setColor(DBread.next());
				mycar.setYear(DBread.nextInt());
				mycar.setMPG(DBread.nextDouble());	
				mycar.setSeating(DBread.nextInt());
				vehicles.add(mycar);
			}
			else if (VC.equals("T")) {
				Truck mytruck = new Truck();
				mytruck.setVClass("T");
				mytruck.setMake(DBread.next());
				mytruck.setModel(DBread.next());
				mytruck.setWeight(DBread.nextInt());
				mytruck.setColor(DBread.next());
				mytruck.setYear(DBread.nextInt());
				mytruck.setMPG(DBread.nextDouble());	
				mytruck.setSeating(DBread.nextInt());
				mytruck.setHauling(DBread.nextInt());
				vehicles.add(mytruck);
			}
			else if (VC.equals("MC")) {
				Motorcycle mymotto = new Motorcycle();
				mymotto.setVClass("MC");
				mymotto.setMake(DBread.next());
				mymotto.setModel(DBread.next());
				mymotto.setWeight(DBread.nextInt());
				mymotto.setColor(DBread.next());
				mymotto.setYear(DBread.nextInt());
				mymotto.setMPG(DBread.nextDouble());	
				vehicles.add(mymotto);
			}
			else if (VC.equals("B")) {
				Bus mybus = new Bus();
				mybus.setVClass("B");
				mybus.setMake(DBread.next());
				mybus.setModel(DBread.next());
				mybus.setWeight(DBread.nextInt());
				mybus.setColor(DBread.next());
				mybus.setYear(DBread.nextInt());
				mybus.setMPG(DBread.nextDouble());	
				mybus.setSeating(DBread.nextInt());
				vehicles.add(mybus);
			}
			else if (VC.equals("CT")){
				CT myCT = new CT();
				myCT.setVClass("CT");
				myCT.setMake(DBread.next());
				myCT.setModel(DBread.next());
				myCT.setWeight(DBread.nextInt());
				myCT.setColor(DBread.next());
				myCT.setYear(DBread.nextInt());
				myCT.setMPG(DBread.nextDouble());	
				myCT.setSeating(DBread.nextInt());
				myCT.setHauling(DBread.nextInt());
				myCT.setIsCombination(DBread.nextBoolean());
				vehicles.add(myCT);
			}
			else
			System.out.println("Vehicle type not valid!");
    
	    }
        System.out.println("What vehicle class would you like to list?(C: Car, T: Truck, MC: Motorcycle, B: Bus, CT: Commercial Truck)");
	    String search = kbd.next();
	    int count = 0;
	    for(Vehicle vehicle : vehicles) {
			String VehicleClass = vehicle.getVClass();
			if (VehicleClass.equals(search)) {
				vehicle.stats();
				System.out.println();
				count++;
			}
		}
	    System.out.println( count + " vehicles of the " + search + " class have been found and returned by your search");
		
        }
    }