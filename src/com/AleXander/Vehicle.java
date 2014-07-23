public class Vehicle extends MuniObject{
    Passenger[] pass;
    Driver driverObj;
    char direction;
    Route routeObj;
    int vehicleID;

    public Vehicle(Driver d, char dir){
        driver = d;
        pass = new Passenger[20];
        direction = dir;
    }
}
