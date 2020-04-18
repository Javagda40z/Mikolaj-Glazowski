package ZadankaDomowePartTwo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class HomeworkData {
    public static void main(String[] args) {
        LocalDateTime dataCzas = LocalDateTime.now();
        LocalDate samaData = LocalDate.now();
        LocalDate pierwszaData = LocalDate.of(2005,4,2);
        LocalDate drugaData = LocalDate.of(2001,9,11);
        int dni = 42; //TODO: change to Scanner
        System.out.println(dataCzas); //zadanie 1
        long ileDniMinelo = ChronoUnit.DAYS.between(LocalDate.of(2020,1,1), samaData);
        System.out.println(ileDniMinelo); //zadanie 2
        long ileDniZostalo = ChronoUnit.DAYS.between(LocalDate.now(),LocalDate.of(2020,12,31));
        System.out.println(ileDniZostalo); //zadanie 3
        long ileDniPomiedzy =ChronoUnit.DAYS.between(pierwszaData,drugaData);
        System.out.println(ileDniPomiedzy);// zadanie 4
        System.out.println(pierwszaData.isAfter(drugaData));//zadanie 5
        System.out.println(samaData.plus(Period.ofDays(dni)));// zadanie 6
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd-MM-yyyy");
        System.out.println(dataCzas.format(formatter)); //zadanie 8
    }


}
