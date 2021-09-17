package com.example.helloworld;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.*;

public class Getdayofweek {
    public static void main(String[] args) {

        //特定の日付を指定して取得 Pattern1
        LocalDateTime dateTime = of
                (2024, 9, 17,22,22,22);
        DayOfWeek dayofweek = dateTime.getDayOfWeek();
        System.out.println(dayofweek);

        //特定の日付を指定して取得 Pattern2
        LocalDateTime datetime = LocalDateTime.now();
        LocalDateTime threeYears = datetime.plusYears(3);
        DayOfWeek dayOfWeek = threeYears.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
