package transport;

import beepers.Beeper;
import brakes.Brake;
import driveUnits.DriveUnit;
import engines.Engine;
import transmissions.Transmission;

public class Moped extends Transport {
    public Moped(Beeper beeper, Engine engine, DriveUnit driveUnit, Transmission transmission, Brake brake) {
        super(beeper, engine, driveUnit, transmission, brake);
    }
}
