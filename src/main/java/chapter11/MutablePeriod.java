package chapter11;

import java.io.*;
import java.util.Date;

/**
 * Created by wangzhenhua on 16/5/20.
 */
public class MutablePeriod {

    private Period period;

    private Date start;

    private Date end;

    public MutablePeriod() throws IOException, ClassNotFoundException {
        Period p = new Period(new Date(),new Date());

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(baos);

        os.writeObject(p);

        byte[] ref = {0x71,0,0x7e,0,5};
        baos.write(ref);
        ref[4] = 4;
        baos.write(ref);

        ObjectInputStream ois = new ObjectInputStream(
                new ByteArrayInputStream(baos.toByteArray()));

        period = (Period) ois.readObject();

        start = (Date)ois.readObject();

        end = (Date)ois.readObject();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MutablePeriod mp = new MutablePeriod();
        Period p = mp.period;

        Date pEnd = mp.end;
        System.out.println(pEnd);
        Date pStart = mp.start;
        System.out.println(pStart);
        pEnd.setYear(78);

        System.out.println(p);

        pEnd.setYear(69);
        System.out.println(p);

    }

}
