import java.util.ArrayList;
import java.util.List;

public class Car {

    Intersection intersection;

    List<Ride> excluded = new ArrayList<>();

    int currentStep = 0;

    public Car(Intersection intersection)
    {
        this.intersection = intersection;
    }

    public Ride chooseBest(List<Ride> rides)
    {
        Ride maxRide = rides.get(0);
        double maxPoints = 0;

        for (Ride ride : rides)
        {
            double points = ride.getQuality(this);

            if(points > maxPoints)
            {
                maxPoints = points;
                maxRide   = ride;
            }
        }

        excluded.add(maxRide);

        return maxRide;
    }
}
