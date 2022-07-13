package vehicles;

import driver.Driver;

public class Car implements Drivable {

    public int tank = 100;
    public int distanceDriven = 0;
    public boolean tankEmpty = false;
    public boolean broken = false;
    public Driver[] owners;
    public String name;
    public double handling;
    public int weight;
    public int speedFactor;



    public Car(String name, int ps, Driver[] owners,int weight, int speedFactor) {

        if(weight < 500 || weight >1000){
            throw new IllegalArgumentException("weight cant only be between 100 and 300");
        }

        if(ps < 100 || ps > 300){
            throw new IllegalArgumentException("ps must can only be between 100 and 300");
        }


        this.weight = weight;
        this.name = name;
        this.owners = owners;
        this.speedFactor = speedFactor;
        // returns double between 0.0 and 1.0
        this.handling = Math.random() * 10;

    }

    //drives for 5 seconds;
    @Override
    public void drive() {
        if(!isTankEmpty()) {
            if (this.broken = false) {
                this.tank -= 1;
                this.distanceDriven += speedFactor;
            }
        }
    }

    //break for 5 second;
    @Override
    public void brake() {
    }


    @Override
    public void isBroken() {
        double determinate = Math.random() * 10;

        if(determinate <= 1){
            this.broken = true;
        }
    }


    public boolean isTankEmpty(){
        if(this.tank == 0){
            this.tankEmpty = true;
            return true;
        }
        return false;
    }

    public int getTank() {
        return tank;
    }

    public Driver[] getOwners() {
        return owners;
    }

    public String getName() {
        return name;
    }

    public double getHandling() {
        return handling;
    }

    public int getWeight() {
        return weight;
    }

    public int getDistanceDriven() {
        return distanceDriven;
    }
}
