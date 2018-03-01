/*
 * Leo von Kleist
 * Andre Graubner
 * Lukas Walker
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        List<Car> cars = new List<Car>();
        List<Ride> rides = new List<Ride>();

        // Create a new Scanner object for reading the input
        Scanner sc = new Scanner(System.in);

        // Read header
        int R = sc.nextInt();
        int C = sc.nextInt();
        int F = sc.nextInt();
        int N = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();

        // Create cars
        for(int i = 0; i < N; i++) {
            cars.add(new Car(new Intersection(0, 0)));
        }

        // Read rides
        for(int i = 0; i <= N; i++) {
            Scanner line = new Scanner(sc.nextLine());

            int a = line.nextInt();
            int b = line.nextInt();
            int x = line.nextInt();
            int y = line.nextInt();
            int s = line.nextInt();
            int f = line.nextInt();

            Intersection start = new Intersection(a, b);
            Intersection end = new Intersection(x, y);

            rides.add(new Ride(start, end, s, f));
        }
    }
}

