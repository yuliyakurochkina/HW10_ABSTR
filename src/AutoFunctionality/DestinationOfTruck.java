package AutoFunctionality;

//Задание3
public class DestinationOfTruck implements Movement {
    @Override
    public String getDirection() {
        return "The school truck moved forward 10 km. ";
    }

    @Override
    public String getDirection2() {
        return "Then it turned right and stopped near the school warehouse. ";
    }
}
