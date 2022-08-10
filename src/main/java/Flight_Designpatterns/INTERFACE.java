package Flight_Designpatterns;

import java.util.ArrayList;

public interface INTERFACE {

    public void getDescription();

    public int getTotalSeats(int totalSeats);

    public ArrayList<Integer> getAvailableSeats();

    public ArrayList<Integer> getBookedSeats();




    void setter(int totalSeats);
}
