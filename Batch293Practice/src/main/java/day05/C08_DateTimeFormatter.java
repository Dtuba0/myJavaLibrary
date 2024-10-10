package day05;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class C08_DateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("  HH:m a\nd.M.y");
        LocalDateTime tarih= LocalDateTime.now();
        System.out.println(dtf.format(tarih));

    }
}
