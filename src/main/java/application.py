
choice=0;
print("\tCar Yard");
print("1. Buy");
print("2. Sell");
print("3. Search");
print("4. Show all");
print("5. Quit");
print("Your option[1-5] : ");
choice=int(input())

if choice > 0 and choice <= 5:
    if choice == 1:
        print(1)
    elif choice == 2:
        print(2)
    elif choice == 3:
        print(3)
    elif choice == 4:
        print(4)
    elif choice == 5:
        print("Terminating...")
        exit

else:
    print("Invalid Option! Must be between 1 and 5")
