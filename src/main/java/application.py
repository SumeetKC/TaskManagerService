from caryard import Caryard

#Select the input of your choice
choice=0;
print("\tCar Yard");
print("1. Buy");
print("2. Sell");
print("3. Search");
print("4. Show all");
print("5. Quit");
print("Your option[1-5] : ");
choice=int(input())

yard = Caryard()

if choice > 0 and choice <= 5:
    if choice == 1:
        yard.buy_car()
    elif choice == 2:
        yard.sell_car()
    elif choice == 3:
        yard.search_car()
    elif choice == 4:
        yard.list_all_cars()
    elif choice == 5:
        print("Terminating...")
        exit

else:
    print("Invalid Option! Must be between 1 and 5")

