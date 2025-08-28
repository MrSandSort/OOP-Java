package Pillars.Abstraction;

abstract class Car {
    
    abstract void start();
    abstract void stop();

    void fuel(){
        System.out.println("Car is refueling.");
    }
}

class ElectricCar extends Car {
    @Override
    void start() {
        System.out.println("Electric car starts with the push button.");
    }

    @Override
    void stop() {
        System.out.println("Electric car stops silently.");
    }
}

class PetrolCar extends Car {
    @Override
    void start() {
        System.out.println("Petrol car starts with the ignition key.");
    }

    @Override
    void stop() {
        System.out.println("Petrol car stops with a sound of the engine.");
    }
}


class CarDemo {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Tesla.start();
        Tesla.fuel();
        Tesla.stop();

        System.out.println();

        Car Honda = new PetrolCar();
        Honda.start();
        Honda.fuel();
        Honda.stop();
    }
}