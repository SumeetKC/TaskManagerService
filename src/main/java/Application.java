import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		CarYard carYard = new CarYard();
		System.out.println("\tCar Yard");
		System.out.println("1. Buy");
		System.out.println("2. Sell");
		System.out.println("3. Search");
		System.out.println("4. Show all");
		System.out.println("5. Quit");

		System.out.print("Your option[1-5] : ");
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			choice = Integer.parseInt(reader.readLine());

			if (choice > 0 && choice <= 5) {
				switch (choice) {
					case 1:
						carYard.buy_car();
						break;
					case 2:
						carYard.sell_car();
						break;
					case 3:
						carYard.search_car();
						break;
					case 4:
						carYard.list_all_cars();
						break;
					case 5:
						System.out.println("Terminating...");
						System.exit(0);

				}

			}
			else
			{
				System.out.println("Invalid Option! Must be between 1 and 5");
			}

		} catch (Exception e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}

	}

}
