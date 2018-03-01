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
            System.out.println("***" + cars.size());

            if (rides.size() == 0 || cars.size() == 0) return;

            List<Car> carsWithRide = new ArrayList<>();

            while(marriage.size() < cars.size())
            {
                if(rides.size() == 0 || cars.size() == 0) break;

                for(int i = 0; i < cars.size(); i++)
                {
                    if(carsWithRide.contains(cars.get(i))) continue;

                    Ride ride = cars.get(i).chooseBest(rides);

                    //find ride
                    if(marriage.containsKey(ride))
                    {
                        if(ride.getQuality(marriage.get(ride)) < ride.getQuality(cars.get(i)))
                        {
                            marriage.remove(ride);
                            carsWithRide.remove(cars.get(i));

                            marriage.put(ride, cars.get(i));
                            carsWithRide.add(cars.get(i));
                        }

                    }
                    else
                    {
                        marriage.put(ride, cars.get(i));
                        carsWithRide.add(cars.get(i));
                    }

                    //exclude car if no rides for car
                    if(cars.get(i).excluded.size() >= rides.size()) cars.remove(cars.get(i));
                }
            }

            for(Ride ride : marriage.keySet())
            {
                marriage.get(ride).addRide(ride);
                rides.remove(ride);
            }

            for(Car car : allCars)
            {
                car.excluded = new ArrayList<>();
            }

            marriage = new HashMap<>();
        }
    }


}
