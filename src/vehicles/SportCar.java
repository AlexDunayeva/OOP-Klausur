package vehicles;

import driver.Driver;

public class SportCar extends Car {
    private int timesDriven = 0;


    public SportCar(String name, int ps, Driver[] owners, int accelartion, int weight) {
        super(name, ps, owners, accelartion, weight);
    }

    private boolean canUseNitro() {
        if (this.timesDriven < 0 && this.timesDriven % 5 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void drive() {
        if (!isTankEmpty()) {
            if (!broken) {
                this.tank -= 1;
                this.timesDriven += 1;
                useNitro();
            }
        }
    }

    public void useNitro() {
        if (canUseNitro()) {
            this.distanceDriven += 50;
        }
    }

}
