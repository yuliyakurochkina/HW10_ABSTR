import AutoFunctionality.*;
import beepers.*;
import brakes.*;
import driveUnits.DriveUnit;
import driveUnits.FourWheelDrive;
import driveUnits.FrontWheelDrive;
import driveUnits.RearDrive;
import engines.*;
import transmissions.AutomaticTransmission;
import transmissions.ManualTransmission;
import transmissions.NoTransmission;
import transmissions.Transmission;
import transport.*;

// Задание1, 2
public class Main {
    public static void main(String[] args) {
        Beeper soundOfMoped = new SoundOfMoped();
        Beeper soundOfMoto = new SoundOfMoto();
        Beeper soundOfAuto = new SoundOfAuto();
        Beeper soundOfTruck = new SoundOfTruck();
        Beeper soundOfBatmobile = new SoundOfBatmobile();

        EngineM1 engineM1 = new EngineM1();
        EngineM2 engineM2 = new EngineM2();
        EngineA1 engineA1 = new EngineA1();
        EngineT1 engineT1 = new EngineT1();
        EngineBatSuper engineBatSuper = new EngineBatSuper();

        DriveUnit frontWD = new FrontWheelDrive();
        DriveUnit rearWD = new RearDrive();
        DriveUnit fourWD = new FourWheelDrive();

        Transmission autoT = new AutomaticTransmission();
        Transmission manualT = new ManualTransmission();
        Transmission noT = new NoTransmission();

        Brake diskB = new DiskBrake();
        Brake drumB = new DrumBrake();
        Brake pnB = new PneumaticBrake();
        Brake hydraB = new HydraulicBrake();

        Moped moped = new Moped(soundOfMoped, engineM1, rearWD, noT, diskB);
        System.out.println("Our moped rides with sound: " + moped.beeper.makeSound()
                + ". It has a speed of " + moped.engine.getSpeed() + " km/h. The moped has "
                + moped.driveUnit.getTypeD() + ", " + moped.transmission.getTypeTr() + ". It slows down in "
                + moped.brake.getTime() + " seconds!");

        Motorcycle motorcycle = new Motorcycle(soundOfMoto, engineM2, rearWD, autoT, diskB);
        System.out.println("Our motorcycle rides with sound: " + motorcycle.beeper.makeSound() + ". It has a speed of "
                + motorcycle.engine.getSpeed() + " km/h. The motorcycle has " + motorcycle.driveUnit.getTypeD() + ", "
                + motorcycle.transmission.getTypeTr() + ". It slows down in " + motorcycle.brake.getTime()
                + " seconds.");

        Automobile automobile = new Automobile(soundOfAuto, engineA1, frontWD, autoT, drumB);
        System.out.println("Our automobile rides with sound: " + automobile.beeper.makeSound() + ". It has a speed of "
                + automobile.engine.getSpeed() + " km/h. The automobile has " + automobile.driveUnit.getTypeD() + ", "
                + automobile.transmission.getTypeTr() + ". It slows down in " + automobile.brake.getTime()
                + " seconds. " + automobile.getTrunk());

        Truck truck = new Truck(soundOfTruck, engineT1, rearWD, manualT, pnB);
        System.out.println("Our truck rides with sound: " + truck.beeper.makeSound() + ". It has a speed of "
                + truck.engine.getSpeed() + " km/h. The truck has " + truck.driveUnit.getTypeD() + ", "
                + truck.transmission.getTypeTr() + ". It slows down in " + truck.brake.getTime() + " seconds. "
                + truck.getCarcase());

        Batmobile batmobile = new Batmobile(soundOfBatmobile, engineBatSuper, fourWD, autoT, hydraB);
        System.out.println("The batmobile rides with sound: " + batmobile.beeper.makeSound() + ". It has a speed of "
                + batmobile.engine.getSpeed() + " km/h. The batmobile has " + batmobile.driveUnit.getTypeD() + ", "
                + batmobile.transmission.getTypeTr() + ". It slows down in " + batmobile.brake.getTime() + " seconds. "
                + batmobile.getNitro());

        //Задание3
        Movement dOfBus = new DestinationOfBus();
        Movement dOfTruck = new DestinationOfTruck();
        Speed sOfBus = new SpeedOfBus();
        Speed sOfTruck = new SpeedOfTruck();

        Bus bus = new Bus(dOfBus, sOfBus);
        System.out.println("The school bus has speed " + bus.speed.getSpeed() + "km/h. " + bus.movement.getDirection()
                + bus.movement.getDirection2() + bus.childrenGotOn() + " children got on the bus. " + bus.lateChildren()
                + " children got on the bus 10 minutes later. ");
        System.out.println(bus.takeHome());

        SchoolTruck schoolTruck = new SchoolTruck(dOfTruck, sOfTruck);
        System.out.println("The school track has speed " + schoolTruck.speed.getSpeed() + "km/h. "
                + schoolTruck.movement.getDirection() + schoolTruck.movement.getDirection2()
                + schoolTruck.unloadProducts());
        System.out.println(schoolTruck.purchase());

    }
}
