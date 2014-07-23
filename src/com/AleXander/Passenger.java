public class Passenger extends user
{
   int initialID;
   int destinationID;

   

   embark (int initialID, int destinationID)
   {
        if(route.contains(initialID) && route.contains(destinationID))
                    vehicle.addPass(this);
   }
}