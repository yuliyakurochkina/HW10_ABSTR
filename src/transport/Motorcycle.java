package transport;

import beepers.Beeper;
import brakes.Brake;
import driveUnits.DriveUnit;
import engines.Engine;
import transmissions.Transmission;

public class Motorcycle extends Transport {
    public Motorcycle(Beeper beeper, Engine engine, DriveUnit driveUnit, Transmission transmission, Brake brake) {
        super(beeper, engine, driveUnit, transmission, brake);
    }
}
