import java.util.ArrayList;
import java.util.List;


public class Cars {
	
	public void addCar(String rego, String model, String color, Double price )
	{
		List<Vehicle> carList = new ArrayList<Vehicle>();
		for(Vehicle vehicle : carList)
		{
			
		}
		carList.add(new Vehicle(rego, model, color, price));
	}

}
