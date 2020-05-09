package ZadaniaPowtorkowe.Meeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    private Meeting meeting;

    @BeforeEach
    void setUp() {
        meeting = new Meeting("opis", "adres");
    }

    @Test
    void testIfDefaultTimeIsNow() {
        assertEquals(LocalDate.now(), meeting.getDate());
    }

    @Test
    void testIfDefaultTimeIsNowAnotherOption() {
        LocalDate now = LocalDate.now();
        LocalDate date = meeting.getDate();
        assertTrue(now.equals(date));
    }

    @Test
    void testIfDefaultRoomSizeIsCorrect() {
        assertEquals(18, meeting.getSize());
    }

    @Test
    void testIfDelayingMeetingDelaysIt() {
        meeting.delayMeeting(5);
        assertEquals(LocalDate.now().plusDays(5), meeting.getDate());
    }

//    test sprawdzający, czy opóźnienie o 0 dni da dzisiejszą datę
}