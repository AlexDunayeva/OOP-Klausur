package race;

import driver.Driver;
import tracs.RaceTrack;
import vehicles.Drivable;


public class Race {
    private Drivable[] vehicles;
    private int[] distanceDrivenByCar;
     private RaceTrack track;
    private Driver winner;

    public Race( RaceTrack track) {
        this.track = track;
        this.vehicles = new Drivable[track.getNumberOfVehicles()];
        this.distanceDrivenByCar = new int[vehicles.length];
    }

    public boolean isfinished(){
        for(int i = 0; i<this.vehicles.length; i++){
            if(this.distanceDrivenByCar[i] >= track.getLength()){
                return true;
            }
        }
        return false;
    }

    public void startRace(){
        while(!isfinished()){
            for(int i = 0; i<vehicles.length; i++){
                vehicles[i].drive();
                distanceDrivenByCar[i] = vehicles[i].getDistanceDriven();
            }
        }
    }
}
