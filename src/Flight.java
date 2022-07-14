import java.util.*;

public class Flight {
    private List<Passenger> passengerList = new ArrayList<>();
    private Map<String, StaffMember> staff = new HashMap<>();
    private Plane plane;
    private Country destination;
    private Country departure;
    private int timeOfFlight;


    public Flight(List<Passenger> passengerList, HashMap<String, StaffMember> staff, Plane plane, Country destination, Country departure, int timeOfFlight) {
        this.passengerList = passengerList;
        this.staff = staff;
        this.plane = plane;
        this.destination = destination;
        this.departure = departure;
        this.timeOfFlight = timeOfFlight;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(List<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Map<String, StaffMember> getStaff() {
        return staff;
    }

    public void setStaff(Map<String, StaffMember> staff) {
        this.staff = staff;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Country getDestination() {
        return destination;
    }

    public void setDestination(Country destination) {
        this.destination = destination;
    }

    public Country getDeparture() {
        return departure;
    }

    public void setDeparture(Country departure) {
        this.departure = departure;
    }

    public int getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(int timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    public boolean isOverbooked() {
        if (this.passengerList.size() > this.plane.getMaxPassengers()) {
            return true;
        }
        return false;
    }

    public void fixOverbooking() {
        while (isOverbooked()) {
            System.out.println("the plane is overbooked");
            Passenger overload = passengerList.get(passengerList.size()-1);
            passengerList.remove(passengerList.size() - 1);
            System.out.println(overload.getFirstName() + " " + overload.getLastName() + " sorry you have to leave the plane");
        }
    }

    public boolean isStaffOnBoard() {
        if (staff.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void startFlight() {

        if (!isStaffOnBoard()) {
            throw new MissingStaffExeption();
        }

        fixOverbooking();
    }
}

