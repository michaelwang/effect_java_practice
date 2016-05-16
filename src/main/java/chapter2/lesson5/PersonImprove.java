package chapter2.lesson5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by wangzhenhua on 16/4/16.
 */
public class PersonImprove {


    private final Date birthDate;

    private static final Date boomStart;
    private static final Date boomEnd;

    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946,Calendar.JANUARY,1,0,0,0);
        boomStart = gmtCal.getTime();
        gmtCal.set(1965,Calendar.JANUARY,1,0,0,0);
        boomEnd = gmtCal.getTime();
    }

    public PersonImprove(Date birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isBabyBoomer(){
        return birthDate.compareTo(boomStart) >= 0 &&
                birthDate.compareTo(boomEnd) < 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            PersonImprove person = new PersonImprove(new Date());
            person.isBabyBoomer();

        }
        long end = System.currentTimeMillis();

        System.out.printf("cost time is : %s\n", (end - start) );


        start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            Person person = new Person(new Date());
            person.isBabyBoomer();
        }
        end = System.currentTimeMillis();

        System.out.printf("cost time is : %s\n", (end - start));

    }

}
