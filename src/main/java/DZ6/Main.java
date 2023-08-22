package DZ6;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(2, 10);
        elevator.move(7);
        System.out.println(elevator);
    }
}
