package example.creational.abstractFactory;

import example.creational.abstractFactory.economy.CarEconomy;
import example.creational.abstractFactory.economy.MotorcycleEconomy;

public class EconomyVehicleFactory implements VehicleFactory{
    @Override
    public Car creteCar() {
        return new CarEconomy();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MotorcycleEconomy();
    }
}
