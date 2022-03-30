package AutoFunctionality;

//Задание3
public class Bus extends AutoFunctionality {

    public Bus(Movement movement, Speed speed) {
        super(movement, speed);
    }

    public int childrenGotOn() {
        return 25;
    }

    public int lateChildren() {
        return 5;
    }

    public String takeHome() {
        return "Now the bus is taking the children home.";
    }
}
