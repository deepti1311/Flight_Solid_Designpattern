package Flight_Designpatterns;

public class mainFlight {
    public static void main(String[] args) {

        FlightInterface flightInterface=FlightCompany.getFlight(Flight.AIRBUS);
        AirBus airBus= flightInterface.getAirBus(FlightType.DOMESTIC);
        airBus.getDescription();
        airBus.getTotalSeats(10);



        System.out.println("\n----------------------------------------------------\n");

        FlightInterface flightInterface1=FlightCompany.getFlight(Flight.AIRINDIA);
        AirIndia airIndia= flightInterface1.getAirIndia(FlightType.INTERNATIONAL);
        airIndia.getDescription();
        airIndia.getTotalSeats(15);

        System.out.println("\n----------------------------------------------------\n");

//        airBus.getTotalSeats();





    }
}
