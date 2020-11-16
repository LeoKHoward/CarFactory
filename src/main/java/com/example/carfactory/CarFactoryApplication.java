package com.example.carfactory;

import com.example.carfactory.parts.*;
import com.example.carfactory.run.RunTheCar;

public class CarFactoryApplication {

    public static void main(String[] args) {

        checkCarSpecifications();

        runningTheCar();

    }

    private static void runningTheCar() {
        RunTheCar carNew = new RunTheCar(80, 60, true, 100);
        carNew.turnOn();
        carNew.viewDashboard();
        carNew.turnOff(50);

//        RunTheCar carNew2 = new RunTheCar(40, 80, true, 50);
//        carNew2.turnOn();
//        carNew2.viewDashboard();
//        carNew2.turnOff(0);
    }

    private static void checkCarSpecifications() {
        Wheels[] wheelsCar1 = getWheelSpecificationsCar1();

        Wheels[] wheelsCar2 = getWheelSpecificationsCar2();


        Engine[] engine = getEngine();


        Body[] body = getBody();


        Chassis[] chassis = getChassis();


        ExtraFeatures[] extraFeatures = getExtraFeatures();


        Car car1 = new Car("Blue", "Audi", 2.0, 110, engine[0], body[0], wheelsCar1,
                chassis[0], extraFeatures[0]);

        wheelCheck(car1);

        bodyCheck(car1);

        chassisCheck(car1);

        engineCheck(car1);

        extraFeaturesCheck(car1);

        carSpecificationsPrinted(car1);


        Car car2 = new Car("Red", "BMW", 6.0, 155, engine[1], body[1], wheelsCar2,
                chassis[1], extraFeatures[1]);
//
//        wheelCheck(car2);
//
//        bodyCheck(car2);
//
//        chassisCheck(car2);
//
//        engineCheck(car2);
//
//        extraFeaturesCheck(car2);
//
//        carSpecificationsPrinted(car2);
    }

    private static void carSpecificationsPrinted(Car car) {
        System.out.println("CAR SPECIFICATIONS:" +
                "\nColour: " + car.getColour()
                + "\nMake: " + car.getMake()
                + "\nLitre: " + car.getLitre()
                + "\nTop Speed: " + car.getTopSpeed() + "mph"

                + "\n\n-----ENGINE-----"
                + "\nMileage: " + car.getEngine().getMileage()
                + "\nFuel Type: " + car.getEngine().getFuelType()
                + "\nTransmission Type: " + car.getEngine().getTransmissionType()
                + "\nNumber of Cylinders: " + car.getEngine().getCylinders()

                + "\n\n-----BODY-----"
                + "\nColour: " + car.getBody().getColour()
                + "\nNumber of Seats: " + car.getBody().getSeats()
                + "\nCruise Control Option: " + car.getBody().isCruiseControl()

                + "\n\n-----WHEELS-----"
                + "\nTyre 1 Pressure: " + car.getWheels()[0].getPressure()
                + "\nTyre 2 Pressure: " + car.getWheels()[1].getPressure()
                + "\nTyre 3 Pressure: " + car.getWheels()[2].getPressure()
                + "\nTyre 4 Pressure: " + car.getWheels()[3].getPressure()

                + "\n\nTyre 1 Colour: " + car.getWheels()[0].getColour()
                + "\nTyre 2 Colour: " + car.getWheels()[1].getColour()
                + "\nTyre 3 Colour: " + car.getWheels()[2].getColour()
                + "\nTyre 4 Colour: " + car.getWheels()[3].getColour()

                + "\n\nTyre 1 Diameter: " + car.getWheels()[0].getDiameter()
                + "\nTyre 2 Diameter: " + car.getWheels()[1].getDiameter()
                + "\nTyre 3 Diameter: " + car.getWheels()[2].getDiameter()
                + "\nTyre 4 Diameter: " + car.getWheels()[3].getDiameter()

                + "\n\nTyre 1 Tread Type: " + car.getWheels()[0].getTread()
                + "\nTyre 2 Tread Type: " + car.getWheels()[1].getTread()
                + "\nTyre 3 Tread Type: " + car.getWheels()[2].getTread()
                + "\nTyre 4 Tread Type: " + car.getWheels()[3].getTread()

                + "\n\n-----CHASSIS-----"
                + "\nAxle: " + car.getChassis().getAxle()
                + "\nSuspension: " + car.getChassis().getSuspension()

                + "\n\n-----EXTRA FEATURES-----"
                + "\nHorn Fitted: " + car.getExtraFeatures().isHasHorn()
                + "\nLights Type: " + car.getExtraFeatures().getLightsType()
                + "\nGPS: " + car.getExtraFeatures().isHasGps()
                + "\nParking Sensors: " + car.getExtraFeatures().isHasParkingSensors());
    }

    private static void wheelCheck(Car car) {
        System.out.println("\nFACTORY CHECK RESULTS:\n");

        boolean factoryCheck = car.wheelsApproved();

        if (factoryCheck) {
            System.out.println("The wheels are up to standard! PASS!\n");
        } else {
            System.out.println("The wheels are not up to standard! FAIL!\n");
        }
    }

    private static void bodyCheck(Car car) {
        boolean factoryCheck = car.bodyApproved();

        if (factoryCheck) {
            System.out.println("The car has the minimum required number of seats! PASS!\n");
        } else {
            System.out.println("The car does not have the minimum required number of seats! FAIL!\n");
        }
    }

    private static void chassisCheck(Car car) {
        boolean factoryCheck = car.chassisApproved();

        if (factoryCheck) {
            System.out.println("The car has both an axle and suspension fitted! PASS!\n");
        } else {
            System.out.println("The car does not have both an axle and suspension fitted! FAIL!\n");
        }
    }

    private static void engineCheck(Car car) {
        boolean factoryCheck = car.engineApproved();

        if (factoryCheck) {
            System.out.println("The engine is up to standard! PASS!\n");
        } else {
            System.out.println("The engine is not up to standard! FAIL!\n");
        }
    }

    private static void extraFeaturesCheck(Car car) {
        boolean factoryCheck = car.extraFeaturesApproved();

        if (factoryCheck) {
            System.out.println("The extra features are all good! PASS!\n");
        } else {
            System.out.println("The extra features need more work! FAIL!\n");
        }
    }

    private static Chassis[] getChassis() {
        Chassis chassis1 = new Chassis("", "Shock Absorbers");
        Chassis chassis2 = new Chassis("Front", "");

        return new Chassis[]{chassis1, chassis2};
    }

    private static Body[] getBody() {
        Body body1 = new Body("Black", 2, true);
        Body body2 = new Body("White", 5, false);

        return new Body[]{body1, body2};
    }

    private static Engine[] getEngine() {
        Engine engine1 = new Engine(2000, "Petrol", "Manual", 3);
        Engine engine2 = new Engine(100, "Diesel", "Automatic", 6);

        return new Engine[]{engine1, engine2};
    }

    private static ExtraFeatures[] getExtraFeatures() {
        ExtraFeatures extraFeaturesCar1 = new ExtraFeatures(true, "Neon", false,
                false);
        ExtraFeatures extraFeaturesCar2 = new ExtraFeatures(false, "", true,
                true);


        return new ExtraFeatures[]{extraFeaturesCar1, extraFeaturesCar2};
    }

    private static Wheels[] getWheelSpecificationsCar1() {

        Wheels wheel1 = new Wheels(0, "Black", 33, "Symmetric");
        Wheels wheel2 = new Wheels(0, "", 33, "Symmetric");
        Wheels wheel3 = new Wheels(0, "Orange", 10, "Symmetric");
        Wheels wheel4 = new Wheels(0, "White", 33, "");

        wheel1.inflate(30);
        wheel2.inflate(34);
        wheel3.inflate(33);
        wheel4.inflate(35);

        return new Wheels[]{wheel1, wheel2, wheel3, wheel4};
    }

    private static Wheels[] getWheelSpecificationsCar2() {

        Wheels wheel1 = new Wheels(0, "Black", 33, "Symmetric");
        Wheels wheel2 = new Wheels(0, "Green", 33, "Symmetric");
        Wheels wheel3 = new Wheels(0, "Orange", 33, "Symmetric");
        Wheels wheel4 = new Wheels(0, "White", 33, "Symmetric");

        wheel1.inflate(34);
        wheel2.inflate(34);
        wheel3.inflate(34);
        wheel4.inflate(34);

        return new Wheels[]{wheel1, wheel2, wheel3, wheel4};
    }
}
