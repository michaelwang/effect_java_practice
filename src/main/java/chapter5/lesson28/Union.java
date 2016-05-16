package chapter5.lesson28;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wangzhenhua on 16/5/13.
 */
public class Union {

    public static <E> Set<E> union(Set<? extends E> s1, Set<? extends E> s2){
        Set<E> result = new HashSet();
        result.addAll(s1);
        result.addAll(s2);
        return result;
    }

    public static void main(String[] args) {
        Set<Double> s1 = new HashSet<>();
        s1.add(0.1);
        s1.add(0.002);
        s1.add(0.11);

        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(3);

        Set<Number> all = Union.<Number>union(s1,s2);
        System.out.println(all);

    }

}
