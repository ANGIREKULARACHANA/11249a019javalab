
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (gc.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
