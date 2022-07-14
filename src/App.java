import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class App {

    public static void main(String[] args) {
        List<Passenger> passengerList = new ArrayList<Passenger>();
        HashMap<String, StaffMember> staff = new HashMap<>();

        Passenger passengerOne = new Passenger("Alex", "Mueller", 222234, 0, false, TravelClass.BUISNESS);
        Passenger passengerTwo = new Passenger("Heinz", "Mueller", 222235, 0, false, TravelClass.ECONOMY);
        Passenger passengerThree = new Passenger("Lucas", "Mueller", 222236, 0, false, TravelClass.ECONOMY);
        Passenger passengerFour = new Passenger("Mathis", "Mueller", 222237, 0, false, TravelClass.ECONOMY);
        Passenger passengerFive = new Passenger("Maria", "Mueller", 222238, 0, false, TravelClass.ECONOMY);
        Passenger passengerSix = new Passenger("Laura", "Mueller", 222239, 0, false, TravelClass.ECONOMY);

        Passenger[] passengers = new Passenger[]{passengerOne, passengerTwo, passengerThree, passengerFour, passengerFive, passengerSix};
        for (int i = 0; i < passengers.length; i++) {
            passengerList.add(passengers[i]);
        }

        Plane airBus = new Plane("Air Bus A360", 5);

        Flight flight = new Flight(passengerList, staff, airBus, Country.BERLIN, Country.MADRIT, 2);
        try {
            flight.startFlight();
        } catch (MissingStaffExeption e) {
            flight = new Flight(passengerList, StaffMember.defaultStaff(), airBus, Country.BERLIN, Country.MADRIT, 2);
            flight.startFlight();
        }
        System.out.println("Welcome on board of the " + flight.getPlane().getName() + "on our flight from " + flight.getDeparture() + " to "
        + flight.getDestination() + " our travel time will be " + flight.getTimeOfFlight() + " hours");
    }


}
