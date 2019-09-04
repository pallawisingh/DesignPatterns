package com.javafeatures;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.stream.Stream;

public class StreamToList {

    Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);
    String ab = "hkaghkgaka";

    public static void main(String[] args) throws ParseException {


//        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
//        System.out.println(Date.from(localDateTime.toInstant(ZoneOffset.UTC)));
//
//        System.out.println(localDateTime);
//
//        Instant machineTimestamp = Instant.now();
//        ZonedDateTime TimeinLA = machineTimestamp.atZone(ZoneId.of("America/Los_Angeles"));
//        System.out.println(Date.from(TimeinLA.toInstant()));

        SimpleDateFormat dateFormatGmt = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        SimpleDateFormat dateFormatLocal = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss");
        Date parse = dateFormatLocal.parse(dateFormatGmt.format(new Date()));
        System.out.println(parse);


    }
}
