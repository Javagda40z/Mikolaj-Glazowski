package ZadaniaPowtorkowe.Meeting;

import java.time.LocalDate;

public class Meeting {
    private String description;
    private LocalDate date;
    private String address;
    private int size;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Meeting(String description, String address) {
        this.description = description;
        this.address = address;
        this.date = LocalDate.now();
        this.size = 18;
    }

    public Meeting(String description, String address, LocalDate date, int size) {
        this.description = description;
        this.date = date;
        this.address = address;
        this.size = size;
    }

    public String opisSpotkania() {
        return "Na co drążyć temat? " + description + "\n"
                + "Kiedy drążyć temat? " + date + "\n"
                + "Gdzie drążyć temat? " + address + "\n"
                + "Ile maksymlnie może drążyć temat? " + size;
    }

    public void delayMeeting(int days) {
        date = date.plusDays(days);
    }



}
