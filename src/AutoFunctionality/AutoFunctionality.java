package AutoFunctionality;

//Задание3
public abstract class AutoFunctionality {
    public Movement movement;
    public Speed speed;

    public AutoFunctionality(Movement movement, Speed speed) {
        this.movement = movement;
        this.speed = speed;
    }
}
