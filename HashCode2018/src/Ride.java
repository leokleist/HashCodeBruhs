public class Ride {

    //id
    public int id = 0;

    //intersections
    public Intersection startI;
    public Intersection endI;

    //times
    public int startT;
    public int endT;

    public int bonus;

    public Ride(Intersection startI, Intersection endI, int startT, int endT, int bonus, int id)
    {
        this.startI = startI;
        this.endI   = endI;
        this.startT = startT;
        this.endT   = endT;
        this.bonus  = bonus;
        this.id = id;
    }

    public double getQuality(Car car)
    {
        int distance = Math.abs(car.intersection.x - startI.x) + Math.abs(car.intersection.y - startI.y);

        if(distance > startT - car.currentStep) return 0;

        //add bonus;
        int bon = 0;

        if(distance == startT - car.currentStep)
        {
            bon += bonus;
        }

        int points = Math.abs(startI.x - endI.x) + Math.abs(startI.y - endI.y);

        return points + bon;
    }
}
