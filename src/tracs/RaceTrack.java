package tracs;

public class RaceTrack {
    private String name;
    private int length;
    private Terrain terrain;
    private int numberOfVehicles;

    public RaceTrack(String name, int length, Terrain terrain, int minNumberOfVehicles) {
        this.name = name;
        this.length = length;
        this.terrain = terrain;
        this.numberOfVehicles = minNumberOfVehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public int getNumberOfVehicles() {
        return numberOfVehicles;
    }

    public void setNumberOfVehicles(int numberOfVehicles) {
        this.numberOfVehicles = numberOfVehicles;
    }
}
