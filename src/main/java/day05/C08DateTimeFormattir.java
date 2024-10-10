package day05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class C08DateTimeFormattir {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:m a \n d-M-y"); //kendimiz bir tarih formati olusturduk
        LocalDateTime tarih = LocalDateTime.now();
        System.out.println(dtf.format(tarih));
       // 13:49 PM
       // 10-10-2024
    }
}
