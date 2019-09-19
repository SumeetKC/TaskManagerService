from vehicle import Vehicle
class Cars:
    
    global carlist
    carlist=list()
    carlist.append(Vehicle("Y100","BMW","Black",1000))
    carlist.append(Vehicle("Y101","Audi","Red",2000))
    carlist.append(Vehicle("Y102","Toyota","White",3000))
    carlist.append(Vehicle("Y103","BMW","Black",4000))
    carlist.append(Vehicle("Y104","Bugati","Cyan",5000))
    carlist.append(Vehicle("Y105","Toyota","Yellow",6000))
    
    #Method to add new vehicle to the list
    def addCar(self,rego,model,color,price):
        vehicle = Vehicle(rego,model,color,price)
        carlist.append(vehicle)
        return carlist
                
    #Method to remove vehicle from the list    
    def removeCar(self,rego):
        for x in carlist:
            if(x.rego == rego):
                carlist.remove(x)
                
        print(str(len(carlist)))
        
    #Method to return all the vehicles in the yard    
    def all_cars(self):
        return carlist
        
    #Method to search for specific vehicle    
    def search(self,rego):
        for x in carlist:
            if(x.rego == rego):
                return x
