import java.util.*;

public class Movie {

    static class MovieApp {
        String name;
        String language;
        int time;

        MovieApp(String name, String language) {
            this.name = name;
            this.language = language;
        }

        void display() {
            System.out.println("Movie: " + name + " | Language: " + language + " | Time: " + time);
        }
    }

    static class Theater extends Movie {
        String theaterName;
        int screen;
        Theater( String theaterName, int screen) {
            this.theaterName = theaterName;
            this.screen = screen;
        }

        void displayTheater() {
            
            System.out.println("Theater: " + theaterName + " | Screen: " + screen);
        }
    }

    static class SeatBooking {
        ArrayList<Integer> seats = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        void bookSeat(int seatNumber) {
            if (seats.contains(seatNumber)) {
                seats.remove(Integer.valueOf(seatNumber));
                System.out.println(" Seat " + seatNumber + " booked.");
            } else {
                System.out.println( "  Seat not available.");
            }
        }

        void available() {
            System.out.println("Available seats: " + seats);
        }

        void cancel(int seatNumber) {
            if (!seats.contains(seatNumber)) {
                seats.add(seatNumber);
                Collections.sort(seats);
                System.out.println("Seat " + seatNumber + " cancelled and added back.");
            } else {
                System.out.println(" Seat was not booked earlier.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SeatBooking booking = new SeatBooking();
     

        
        System.out.println(" Enter option (BOOKING-1, AVAILABLE-2, CANCEL-3):");
        int option = s.nextInt();

        switch(option) {
            case 1:
                System.out.println("Enter seat number:");
                int seatNumber = s.nextInt();
                booking.bookSeat(seatNumber);
                break;

            case 2:
                booking.available();
                break;

            case 3:
                System.out.println("Enter seat number to cancel:");
                int cancelSeat = s.nextInt();
                booking.cancel(cancelSeat);
                break;

        }
    s.close();
    }
}
