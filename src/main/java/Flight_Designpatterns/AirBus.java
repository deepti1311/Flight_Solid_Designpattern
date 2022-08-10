package Flight_Designpatterns;

import java.util.ArrayList;

public interface AirBus {
    public void getDescription();

    public int getTotalSeats(int totalSeats);

    public ArrayList<Integer> getAvailableSeats();

    public ArrayList<Integer> getBookedSeats();




    void setter(int totalSeats);
}







class DomesticAIRBUS implements AirBus{

    public int totalSeats;
    public ArrayList<Integer> availableSeats=new ArrayList<Integer>();
    public ArrayList<Integer> bookedSeats=new ArrayList<Integer>();


    @Override
    public void getDescription() {
        System.out.println("Welcome to Airbus Domestic flights!!");

    }

    public int getTotalSeats(int totalSeats) {
        System.out.println("Total number of Seats: "+totalSeats);

        return this.totalSeats;

    }


    public ArrayList<Integer> getAvailableSeats() {
        return this.availableSeats;


    }



    public ArrayList<Integer> getBookedSeats() {
        return this.bookedSeats;


    }


    @Override
    public void setter(int totalSeats) {
        this.totalSeats = totalSeats;



        for (int i = 1; i<=totalSeats; i++){
            this.availableSeats.add(i);
            this.bookedSeats.add(i);
        }


    }


}







class InternationalAIRBUS implements AirBus{

    public int totalSeats;
    public ArrayList<Integer> availableSeats=new ArrayList<Integer>();
    public ArrayList<Integer> bookedSeats=new ArrayList<Integer>();

    @Override
    public void getDescription() {
        System.out.println("Welcome to Airbus International flight!!");

    }

    @Override
    public int getTotalSeats(int totalSeats) {

        System.out.println("Total number of Seats: "+totalSeats);
        return this.totalSeats;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {
        return this.availableSeats;
    }

    @Override
    public ArrayList<Integer> getBookedSeats() {
        return this.bookedSeats;
    }

    @Override
    public void setter(int totalSeats) {
        this.totalSeats =totalSeats;



        for (int i = 1; i<=totalSeats; i++){
            this.availableSeats.add(i);
            this.bookedSeats.add(i);
        }

    }




}

