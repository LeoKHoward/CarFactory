package com.example.carfactory;

import com.example.carfactory.parts.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class CarTest {

    public Engine testEngine = new Engine(2000, "Petrol", "Manual", 4);
    public Body testBody = new Body("Black", 2, true);
    public Wheels[] testWheels = new Wheels[0];
    public Chassis testChassis = new Chassis("Front", "Shock Absorbers");
    public ExtraFeatures testExtraFeatures = new ExtraFeatures(true, "Neon", false,
            false);

    public Car testCar = new Car("Red", "Mercedes", 3.5, 140, testEngine, testBody,
            testWheels, testChassis, testExtraFeatures);

    @Test
    void wheelsApproved() {

    }

    @Test
    void bodyApproved() {

        testBody = new Body("Black", 2, true);
        Car testCar = new Car("Red", "Mercedes", 3.5, 140, testEngine, testBody,
                testWheels, testChassis, testExtraFeatures);



        Car mockIo = mock(Car.class);

//        UserInterface exactMoneyGiven = new UserInterface(mockIo);

        String expectedOutput = "\nThe car has the minimum required number of seats! PASS!";

        assertEquals(testCar.bodyApproved(), "The car has the minimum required number of seats! PASS!");
    }

    @Test
    void chassisApproved() {
    }

    @Test
    void engineApproved() {
    }

    @Test
    void extraFeaturesApproved() {
    }
}