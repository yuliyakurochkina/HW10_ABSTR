package beepers;

public class SoundOfTruck implements Beeper {
    @Override
    public String makeSound() {
        return "schrr";
    }
}
