package transport;

import beepers.Beeper;
import brakes.Brake;
import engines.Engine;
import transmissions.Transmission;
import driveUnits.DriveUnit;

public abstract class Transport {
    public Beeper beeper;
    public Engine engine;
    public DriveUnit driveUnit;
    public Transmission transmission;
    public Brake brake;

    public Transport(Beeper beeper, Engine engine, DriveUnit driveUnit, Transmission transmission, Brake brake) {
        this.beeper = beeper;
        this.engine = engine;
        this.driveUnit = driveUnit;
        this.transmission = transmission;
        this.brake = brake;
    }
}
