package AutoFunctionality;

//Задание3
public class SchoolTruck extends AutoFunctionality {
    public SchoolTruck(Movement movement, Speed speed) {
        super(movement, speed);
    }

    public String unloadProducts() {
        return "The school truck unloaded 100 kg of products. ";
    }

    public String purchase() {
        return "Now the truck is going to buy a new batch of products.";
    }
}
