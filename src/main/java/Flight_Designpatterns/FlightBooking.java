//package Flight_Designpatterns;
//
//import java.util.ArrayList;
//
//
//
//abstract class Booking{
//
//
//   protected int totalSeats;
//   protected ArrayList<Integer> availableSeats= new ArrayList<Integer>();
//   protected ArrayList<Integer> bookedSeats = new ArrayList<Integer>();
//
//
//
//
//    public void seatBooking(int seatNo) {
//
//        System.out.println("Flight Booking details:");
//        System.out.println("Total Number of Seats "+this.totalSeats);
//
//
//
//        if (checkseat(seatNo)){
//            this.availableSeats.remove(this.availableSeats.indexOf(seatNo));
//            this.bookedSeats.set((seatNo-1),0);
//            System.out.println("Seat Number : "+seatNo);
//            System.out.println("SEAT BOOKED SUCCESSFULLY!!!");
//        }else {
//            System.out.println("SEAT UNAVAILABLE");
//        }
//
//
//    }
//
//
//    public  boolean checkseat(int seatNo){
//        for (int seat:this.availableSeats) {
//            if (seat==seatNo){
//                return  true;
//            }
//
//        }
//        return false;
//    }
//
//}
//
//
//class FlightBooking extends Booking{
//
//    public void flightseatBooking(int seatNo) {
//            seatBooking(seatNo);
//    }
//}
