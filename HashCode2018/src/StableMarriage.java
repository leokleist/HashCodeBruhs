import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StableMarriage {

    List<Car> cars;
    List<Ride> rides;

    List<Car> allCars = new ArrayList<>();

    Map<Ride, Car> marriage = new HashMap<>();

    public static void main(String[] args)
    {

    }


    StableMarriage(List<Car> cars, List<Ride> rides)
    {
        for(Car car : cars)
        {
            allCars.add(car);
        }


        while(cars.size() > 0)
        {
            List<Car> carsWithRide = new ArrayList<>();

            while(marriage.size() < cars.size())
            {
                for(Car car : cars)
                {
                    if(carsWithRide.contains(car)) continue;

                    Ride ride = car.chooseBest(rides);

                    //find ride
                    if(marriage.containsKey(ride))
                    {
                        if(ride.getQuality(marriage.get(ride)) < ride.getQuality(car))
                        {
                            marriage.remove(ride);
                            carsWithRide.remove(car);
                        }

                    }
                    else
                    {
                        marriage.put(ride, car);
                        carsWithRide.add(car);
                    }

                    //exclude car if no rides for car
                    if(car.excluded.size() >= rides.size()) cars.remove(car);
                }
            }

            for(Ride ride : marriage.keySet())
            {
                marriage.get(ride).addRide(ride);
                rides.remove(ride);
            }

            marriage = new HashMap<>();
        }
    }


}
