package DZ6;

public class Elevator {
    private int floor = 1;

    private int floormax;
    private  int floormin;

    public Elevator(int floormin, int floormax) {
        this.floormin = floormin;
        this.floormax = floormax;
    }

    public Elevator(int floormax) {
        this.floormin = 1;
        this.floormax = floormax;
    }
    public void move(int floor) {
        if (floor <= floormax && floor >= floormin) {
            this.floor = floor;
            System.out.println("вы на этаже " + this.floor);
        } else if (floor > floormax) {
            System.out.println("вы не можете подняться выше этажа " + floormax);
        } else {
            System.out.println("вы не можете опуститься ниже этажа " + floormin);
        }


        }

    @Override
    public String toString() {
        return "[" + floormin + ", " + floormax + "]" + "->" + floor;
    }
}



