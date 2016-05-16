package chapter5.lesson28;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wangzhenhua on 16/5/13.
 */
public class Max {


    public static <T extends Comparable<? super T>> T max ( List<? extends T> list ) {
        Iterator<? extends T> it = list.iterator();
        T max  = it.next();
        while ( it.hasNext() ){
            T current = it.next();

            if ( current.compareTo(max) > 0 ){
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        Integer max =  Max.max(list);
        System.out.println(max);
    }

}
