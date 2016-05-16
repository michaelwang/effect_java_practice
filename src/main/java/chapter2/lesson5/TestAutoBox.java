package chapter2.lesson5;

/**
 * Created by wangzhenhua on 16/4/16.
 */
public class TestAutoBox {

    public static void main(String[] args) {

        Long sum = 0L;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(sum);
        System.out.printf("cost time : %s\n",(end - begin));


        long newSum = 0L;
        begin = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            newSum += i;
        }
        end = System.currentTimeMillis();
        System.out.println(newSum);
        System.out.printf("new cost time is : %s\n",(end - begin));
    }
}
