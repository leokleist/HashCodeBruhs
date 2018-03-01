import java.util.ArrayList;
import java.util.List;

public class Car {

    int id = 0;

    Intersection intersection;

    List<Ride> excluded = new ArrayList<>();

    List<Ride> rides = new ArrayList<>();

    int currentStep = 0;

    public Car(Intersection intersection, int id)
    {
        this.intersection = intersection;
        this.id = id;
    }

    public Ride chooseBest(List<Ride> rides)
    {
        Ride maxRide = rides.get(0);
        double maxPoints = 0;

        for (Ride ride : rides)
        {
            if(excluded.contains(ride)) continue;

            double points = ride.getQuality(this);

            if(points >= maxPoints)
            {
                maxPoints = points;
                maxRide   = ride;
            }
        }

        excluded.add(maxRide);

        return maxRide;
    }

    public void addRide(Ride ride)
    {
        rides.add(ride);
        currentStep = Intersection.distance(intersection, ride.startI) + Intersection.distance(ride.startI, ride.endI);
    }
}
