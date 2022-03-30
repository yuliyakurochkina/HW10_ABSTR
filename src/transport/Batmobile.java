package transport;

import beepers.Beeper;
import brakes.Brake;
import driveUnits.DriveUnit;
import engines.Engine;
import transmissions.Transmission;

public class Batmobile extends Transport {
    public Batmobile(Beeper beeper, Engine engine, DriveUnit driveUnit, Transmission transmission, Brake brake) {
        super(beeper, engine, driveUnit, transmission, brake);
    }

    public String getNitro() {
        return "Nitro is on.";
    }
}
