package chapter2.lesson5;

import org.omg.CORBA.DATA_CONVERSION;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wangzhenhua on 16/4/16.
 */
public class Person {

    private final Date birthDate;

    public Person(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        Date boomStart = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        Date boomEnd = gmtCal.getTime();
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;

    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Person person = new Person(new Date());
            person.isBabyBoomer();

        }
        long end = System.currentTimeMillis();

        System.out.printf("cost time is : %s", (end - start) );

    }

}
