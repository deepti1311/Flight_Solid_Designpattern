package Flight_Designpatterns;




public class FlightCompany  {
    public static FlightInterface getFlight(Flight flight) {
        switch (flight){
            case AIRBUS:
                return new getAirBus();
            case AIRINDIA:
                return new getAirIndia();



        }
        return null;
    }





}
