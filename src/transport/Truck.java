package transport;

import beepers.Beeper;
import brakes.Brake;
import driveUnits.DriveUnit;
import engines.Engine;
import transmissions.Transmission;

public class Truck extends Transport {
    public Truck(Beeper beeper, Engine engine, DriveUnit driveUnit, Transmission transmission, Brake brake) {
        super(beeper, engine, driveUnit, transmission, brake);
    }

    public String getCarcase() {
        return "The truck has a carcase.";
    }
}
