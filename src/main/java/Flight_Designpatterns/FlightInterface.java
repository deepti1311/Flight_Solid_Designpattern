package Flight_Designpatterns;

public interface FlightInterface {
  AirBus getAirBus(FlightType flightType);
  AirIndia getAirIndia(FlightType flightType);

}


class getAirBus implements FlightInterface{


    @Override
    public AirBus getAirBus(FlightType flightType) {

        switch (flightType){
            case DOMESTIC:
                return new DomesticAIRBUS();
            case INTERNATIONAL:
                return new InternationalAIRBUS();
        }
        return null;
    }

    @Override
    public AirIndia getAirIndia(FlightType flightType) {
        return null;
    }




}
class getAirIndia implements FlightInterface{


    @Override
    public AirBus getAirBus(FlightType flightType) {


        return null;
    }

    @Override
    public AirIndia getAirIndia(FlightType flightType) {
        switch (flightType){
            case DOMESTIC:
                return new DomesticAIRINDIA();
            case INTERNATIONAL:
                return new InternationalAIRINDIA();
        }
        return null;
    }




}

