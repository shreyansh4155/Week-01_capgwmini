import java.time.*;

public class TimeZones {

    public static void main(String[] args) {
        // Get current time in UTC (GMT)
        ZonedDateTime utcTime = ZonedDateTime.now(ZoneId.of("UTC"));

        // Convert to IST
        ZonedDateTime istTime = utcTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

        // Convert to PST
        ZonedDateTime pstTime = utcTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        // Display times
        System.out.println("GMT (UTC): " + utcTime);
        System.out.println("IST: " + istTime);
        System.out.println("PST: " + pstTime);
    }
}