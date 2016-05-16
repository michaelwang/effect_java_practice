package chapter2.lesson12;

/**
 * Created by wangzhenhua on 16/5/9.
 */
public class Phone implements Comparable<Phone> {

    private int area;

    private int lineNumber;

    @Override
    public int compareTo(Phone o) {
        int differenceArea = area - o.area;
        if (differenceArea != 0)
            return differenceArea;

        int differenceLineNumber = lineNumber - o.lineNumber;
        if (differenceLineNumber != 0 )
            return differenceLineNumber;
        return 0;
    }
}
