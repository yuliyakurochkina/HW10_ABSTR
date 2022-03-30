package AutoFunctionality;

//Задание3
public class DestinationOfBus implements Movement {
    @Override
    public String getDirection() {
        return "The bus moved forward 5 km. ";
    }

    @Override
    public String getDirection2() {
        return "Then it turned left and stopped near the bus stop.";
    }
}
