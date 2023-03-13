package com.example.vicsoundpool;
import java.util.Date, java.util.Calendar;

public class unixTimeConvention {
    Date date = new Date();
    long unixTime = date.getTime() / 1000L;
// 1644332696
// this is Tuesday, February 8, 2022 10:04:56 AM GMT-05:00
// Eastern Standard Time is GMT minus 5:00, project to stay on standard or savings time
// conventional way of unix time conversion
    // incorporate this into the handclock Schlage timeclock
    // compare with python class
}
