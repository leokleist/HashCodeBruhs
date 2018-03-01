public class Intersection {

    public int x;
    public int y;

    public Intersection(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Get distance of two intersections
    public static int distance(Intersection i1, Intersection i2) {
        return Math.abs(i1.x - i2.x) + Math.abs(i1.y - i2.y);
    }
}
