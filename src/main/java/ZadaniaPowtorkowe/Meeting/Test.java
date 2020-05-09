package ZadaniaPowtorkowe.Meeting;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Meeting meeting = new Meeting("opis", "adres");

        Meeting meeting1 = new Meeting("opis2", "adres2", LocalDate.now().plusDays(2), 20);

        System.out.println(meeting.opisSpotkania());
        System.out.println(meeting1.opisSpotkania());
    }
}
