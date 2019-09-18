import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CarYard {
	
	public void buy_car()
	{
		String rego = "";
		String model = "";
		String color = "";
		Double price = new Double(0);
		Cars cars = new Cars();
		try{
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Rego : ");
		rego = reader.readLine();
		System.out.print("Enter Model : ");
		model = reader.readLine();
		System.out.print("Enter Color : ");
		color = reader.readLine();
		System.out.print("Enter Price : ");
		price = Double.valueOf(reader.readLine());
		
		cars.addCar(rego, model, color, price);
		
		System.out.println("-------------------------");
		System.out.println("Car added: "+model);
		}catch(Exception e)
		{
			System.out.println("Exception Occurred : ");
			e.printStackTrace();
		}
	}
	
	public void sell_car()
	{
		
	}
	public void search_car()
	{
		
	}
	public void list_all_cars()
	{
		
	}
	

}
