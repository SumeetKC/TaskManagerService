from cars import Cars
class Caryard:
    
    #Method to buy car for car yard
    def buy_car(self):
        car = Cars()
        print("Buy Car")
        print("-----------------------------")
        print("Enter rego : ")
        rego=input()
        print("Enter model : ")
        model=input()
        print("Enter color : ")
        color=input()
        print("Enter price : ")
        price=int(input())
        car.addCar(rego,model,color,price)
    
        print("-----------------------------")
        print("Car Added: "+model)
    
    #Method to sell car from car yard
    def sell_car(self):
        car = Cars()
        print("Sell Car")
        print("-----------------------------")
        print("Enter car rego : ")
        rego=input()
        vehicle=car.search(rego)
        
        print("Car Model: "+vehicle.model)
        print("Car Color: "+vehicle.color)
        print("Car Purchase Price: $"+str(vehicle.price))
        sellingPrice=vehicle.price*(1+0.3)
        print("Car Sell Price: $"+str(sellingPrice))
        
        car.removeCar(rego)
 
    #Method to search car from car yard    
    def search_car(self):
        car = Cars()
        print("Search Car")
        print("-----------------------------")
        print("Enter car rego : ")
        rego=input()
        vehicle=car.search(rego)
        
        print("Car Model: "+vehicle.model)
        print("Car Color: "+vehicle.color)
        print("Car Purchase Price: $"+str(vehicle.price))        
    
    #Method to get list of cars from car yard
    def list_all_cars(self):
        car = Cars()
        no=0
        vehiclelist = car.all_cars()
        print("Cars in Yard")
        print("-----------------------------")
        print("Cars in yard (Total :"+str(len(vehiclelist))+")")
        print("No#\tRego\tModel\tColor\tPrice")
        for x in vehiclelist:
            no=int(no)+1
            print(str(no)+"\t"+x.rego+"\t"+x.model+"\t"+x.color+"\t"+str(x.price))
        
