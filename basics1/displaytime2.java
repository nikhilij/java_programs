// wap display the current date and time in a specific format.

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
public class displaytime2 {
    public static void main(String[] args){
        SimpleDateFormat cdt =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("IST")));
        System.out.println("\nNow :  "+cdt.format(System.currentTimeMillis()));
    }
}
