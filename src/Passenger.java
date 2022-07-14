public class Passenger extends Person {

    private int travelMiles;
    private boolean membership;
    private TravelClass travelClass;

    public Passenger(String firstName, String lastName, int passportNumber, int travelMiles, boolean membership, TravelClass travelClass) {
        super(firstName, lastName, passportNumber);
        this.travelMiles = travelMiles;
        this.membership = membership;
        this.travelClass = travelClass;
    }

    public int getTravelMiles() {
        return travelMiles;
    }

    public void setTravelMiles(int travelMiles) {
        this.travelMiles = travelMiles;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }

    public TravelClass getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(TravelClass travelClass) {
        this.travelClass = travelClass;
    }
}
