public class Ride {

    //intersections
    public Intersection startI;
    public Intersection endI;

    //times
    public int startT;
    public int endT;

    public Ride(Intersection startI, Intersection endI, int startT, int endT)
    {
        this.startI = startI;
        this.endI   = endI;
        this.startT = startT;
        this.endT   = endT;
    }
}
